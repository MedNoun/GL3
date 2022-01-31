import { PartialType } from '@nestjs/mapped-types';
import { CreateCoffeeDto } from './create-coffee.dto';

export class UpdateCoffeeDto extends PartialType(CreateCoffeeDto) {}
//partial type returns the type of the DTO passed in paremeter and
//and inherit its fields with its validation decorators and mark the as optional
