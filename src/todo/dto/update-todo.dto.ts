import { PartialType } from '@nestjs/mapped-types';
import { TodoStatusEnum } from '../entities/todo-status.enum';
import { CreateTodoDto } from './create-todo.dto';

export class UpdateTodoDto extends PartialType(CreateTodoDto) {
  status: TodoStatusEnum;
}
