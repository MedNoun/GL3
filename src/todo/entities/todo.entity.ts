import { TodoStatusEnum } from './todo-status.enum';

export class Todo {
  constructor(
    public id: string,
    public name: string,
    public desc: string,
    public createdAt = new Date(),
    public status: TodoStatusEnum = TodoStatusEnum.waiting,
  ) {}
}
