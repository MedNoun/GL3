import { IsNotEmpty, IsString } from 'class-validator';

export class CreateSkillDto {
  @IsNotEmpty()
  designation: string;
  @IsString({ each: true })
  cv: string[];
}
