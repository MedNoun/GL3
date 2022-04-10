/* eslint-disable prettier/prettier */
import {
  Body,
  Controller,
  Get,
  Post,
  Patch,
  Delete,
  Param,
  Query,
} from '@nestjs/common';
import { TodoService } from './todo.service';
import { SearchTodoDto } from './dto/search-todo.dto';
import { StatsTodoDto } from './dto/stats-todo.dto';
import { CreateTodoDto } from './dto/create-todo.dto';
import { Todo } from './entities/todo.entity';
import { UpdateTodoDto } from './dto/update-todo.dto';
import { DeleteResult } from 'typeorm/query-builder/result/DeleteResult';

@Controller('todo')
export class TodoController {
  constructor(private todoService: TodoService) {}

  @Get()
  getTodos(@Query() searchTodo: SearchTodoDto): Promise<Todo[]> {
    return this.todoService.findAll(searchTodo);
  }

  @Get('/stats')
  getTodoStats(@Query() statsTodo: StatsTodoDto): Promise<any> {
    return this.todoService.getTodoStats(statsTodo);
  }

  @Get('/:id')
  getTodoById(@Param('id') id: string): Promise<Todo> {
    return this.todoService.findOneById(id);
  }

  @Post()
  addTodo(@Body() todo: CreateTodoDto): Promise<Todo> {
    return this.todoService.addTodo(todo);
  }

  @Patch('/:id')
  updateTodo(
    @Param('id') id: string,
    @Body() newTodo: UpdateTodoDto,
  ): Promise<Todo> {
    return this.todoService.updateTodo(newTodo, id);
  }

  @Delete('/:id')
  DeleteTodo(@Param('id') id: string): Promise<DeleteResult> {
    return this.todoService.deleteTodo(id);
  }
}
