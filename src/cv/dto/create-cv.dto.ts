import {
  ArrayUnique,
  IsArray,
  IsNotEmpty,
  IsNumber,
  IsString,
  ValidateNested,
} from 'class-validator';

export class CreateCvDto {
  @IsNotEmpty()
  idUser: number;
  @IsArray()
  @IsString({ each: true })
  designation: string[];
  @IsString()
  name: string;
  @IsString()
  firstname: string;
  @IsNumber()
  age: number;
  @IsString()
  cin: string;
  @IsString()
  job: string;
  @IsString()
  path: string;
}
