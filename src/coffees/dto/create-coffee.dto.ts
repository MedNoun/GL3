import { ApiProperty } from '@nestjs/swagger';
import { IsString } from 'class-validator';
import { Flavor } from '../entities/flavor.entity';

export class CreateCoffeeDto {
  @ApiProperty({ description: 'the name of a coffee.' })
  @IsString()
  readonly name: string;
  @ApiProperty({ description: 'the brand of the coffee' })
  @IsString()
  readonly brand: string;
  @ApiProperty({ description: 'the flavors of the coffee' })
  @IsString({ each: true })
  readonly flavors: string[];
}
