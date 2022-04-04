import {
  IsEmail,
  IsNotEmpty,
  IsString,
  MaxLength,
  MinLength,
} from 'class-validator';

export class CreateUserDto {
  @IsNotEmpty()
  @IsString()
  username: string;
  @IsEmail()
  @IsString()
  email: string;
  @IsNotEmpty()
  @IsString()
  password: string;
}
