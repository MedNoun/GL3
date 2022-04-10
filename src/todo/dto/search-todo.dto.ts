import { IsEnum, IsOptional } from 'class-validator';
import { StatusEnum } from '../enums/status.enum';

export class SearchTodoDto {
  @IsOptional()
  criteria: string;
  @IsOptional()
  @IsEnum(StatusEnum)
  status: StatusEnum;
  @IsOptional()
  page: number;
  @IsOptional()
  offset: number;
}
