import {
  Body,
  Controller,
  Delete,
  Get,
  HttpCode,
  HttpException,
  HttpStatus,
  NotFoundException,
  Param,
  Patch,
  Post,
  Query,
} from '@nestjs/common';
import { CoffeesService } from './coffees.service';
import { CreateCoffeeDto } from './dto/create-coffee.dto';
import { UpdateCoffeeDto } from './dto/update-coffee.dto';

@Controller('coffees')
export class CoffeesController {
  constructor(private readonly coffesService: CoffeesService) {}
  @Get()
  findAll(@Query() paginationQuery) {
    const { limit, offset } = paginationQuery;
    return this.coffesService.findAll();
  }
  //   you can access library specific elements from express but its not recomended
  //   @Get()
  //   findAll(@Res() response) {
  //     response.status(200).send('hello there from express');
  //   }
  //we can remove the id and replace id by params.id to access it ! :
  @Get(':id')
  findOne(@Param('id') id: string) {
    //   findOne(@Param() params) {
    const coffee = this.coffesService.findOne(id); //return `This action returns #${params.id}`;
    if (!coffee) {
      throw new NotFoundException(`Coffe #${id} not found`);
    }
    return coffee;
  }
  @Post()
  @HttpCode(HttpStatus.GONE) //specify the http status code
  create(@Body() createCoffeeDto: CreateCoffeeDto) {
    // we can select a specific body part @Body('name')
    return this.coffesService.create(createCoffeeDto);
  }

  @Patch(':id')
  update(@Param('id') id: string, @Body() updateCoffeeDto: UpdateCoffeeDto) {
    return this.coffesService.update(id, updateCoffeeDto);
  }

  @Delete(':id')
  remove(@Param('id') id: string) {
    return this.coffesService.remove(id);
  }
}
