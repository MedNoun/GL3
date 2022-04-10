/* eslint-disable prettier/prettier */
import { Injectable, NotFoundException } from '@nestjs/common';
import { Like, Repository } from 'typeorm';
import { Todo } from './entities/todo.entity';
import { InjectRepository } from '@nestjs/typeorm';
import { UpdateTodoDto } from './dto/update-todo.dto';
import { DeleteResult } from 'typeorm/query-builder/result/DeleteResult';
import { UpdateResult } from 'typeorm/query-builder/result/UpdateResult';
import { SearchTodoDto } from './dto/search-todo.dto';
import { StatsTodoDto } from './dto/stats-todo.dto';

@Injectable()
export class TodoService {
  constructor(
    @InjectRepository(Todo)
    private todoRepository: Repository<Todo>,
  ) {}

  async addTodo(todo: Partial<Todo>): Promise<Todo> {
    return await this.todoRepository.save(todo);
  }

  async updateTodo(updateTodoDto: UpdateTodoDto, id: string): Promise<Todo> {
    const newTodo = await this.todoRepository.preload({ id, ...updateTodoDto });
    if (newTodo) {
      return this.todoRepository.save(newTodo);
    } else {
      throw new NotFoundException(`Le todo d'id ${id} n'existe pas `);
    }
  }

  async deleteTodo(id: string): Promise<DeleteResult> {
    const result = await this.todoRepository.delete(id);
    if (result.affected) {
      return result;
    }
    throw new NotFoundException(`Le todo d'id ${id} n'existe pas `);
  }

  async softDeleteTodo(id: string): Promise<UpdateResult> {
    const result = await this.todoRepository.softDelete(id);
    if (result.affected) {
      return result;
    }
    throw new NotFoundException(`Le todo d'id ${id} n'existe pas `);
  }

  async softRestoreTodo(id: string) {
    const result = await this.todoRepository.restore(id);
    if (result.affected) {
      return result;
    }
    throw new NotFoundException(`Le todo d'id ${id} n'existe pas `);
  }

  async findAll(searchTodoDto: SearchTodoDto): Promise<Todo[]> {
    const criterias = [];
    const page = searchTodoDto.page || 1;
    const offset = searchTodoDto.offset || 5;
    const skip = (page - 1) * offset;

    if (searchTodoDto.status) {
      criterias.push({ status: searchTodoDto.status });
    }
    if (searchTodoDto.criteria) {
      criterias.push({ name: Like(`%${searchTodoDto.criteria}%`) });
      criterias.push({ description: Like(`%${searchTodoDto.criteria}%`) });
    }

    return await this.todoRepository.find({
      withDeleted: true,
      ...(criterias.length ? { where: criterias } : {}),
      take: offset,
      skip: skip,
    });
  }

  async findOneById(id: string): Promise<Todo> {
    const todo = await this.todoRepository.findOne({ id });
    if (todo) return todo;
    throw new NotFoundException(`Le todo d'id ${id} n'existe pas `);
  }

  async getTodoStats(statsTodo: StatsTodoDto): Promise<any> {
    const from = statsTodo.from || '1970-01-01';
    const to = statsTodo.to || '2500-12-31';

    const queryBuilder = this.todoRepository.createQueryBuilder('todo');
    return await queryBuilder
      .select('todo.status')
      .addSelect('count(*)', 'todos')
      .where('todo.createdAt Between :from AND :to')
      .setParameter('from', from)
      .setParameter('to', to)
      .groupBy('todo.status')
      .getRawMany();
  }
}
