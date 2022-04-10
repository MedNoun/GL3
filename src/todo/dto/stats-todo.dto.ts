import { IsOptional } from 'class-validator';

export class StatsTodoDto {
  @IsOptional()
  from: string;

  @IsOptional()
  to: string;
}
