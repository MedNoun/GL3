import { Injectable, NotFoundException } from '@nestjs/common';
import { randomUUID } from 'crypto';
import { CreateTodoDto } from './dto/create-todo.dto';
import { UpdateTodoDto } from './dto/update-todo.dto';
import { Todo } from './entities/todo.entity';

@Injectable()
export class TodoService {
  private todos: Todo[] = [];
  create(createTodoDto: CreateTodoDto) {
    this.todos.push(
      new Todo(randomUUID(), createTodoDto.name, createTodoDto.desc),
    );
    return this.todos;
  }

  findAll() {
    return this.todos;
  }

  findOne(id: string) {
    let element = this.todos.find((e) => e.id === id);
    if (element) {
      return element;
    }
    throw new NotFoundException('element with id ' + id + ' not found !');
  }

  update(id: string, updateTodoDto: UpdateTodoDto) {
    let element: Todo = this.findOne(id);
    element.name = updateTodoDto.name ?? element.name;

    element.desc = updateTodoDto.desc ?? element.desc;

    element.status = updateTodoDto.status ?? element.status;

    return element;
  }

  remove(id: string) {
    this.todos = this.todos.filter((e) => e.id !== id);
    return `This action removes a #${id} todo`;
  }
}
