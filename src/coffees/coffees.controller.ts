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
  SetMetadata,
} from '@nestjs/common';
import { Public } from 'src/common/decorators/public.decorator';
import { PaginationQueryDto } from 'src/common/dto/pagination-query.dto';
import { ParseIntPipe } from 'src/common/pipes/parse-int.pipe';
import { CoffeesService } from './coffees.service';
import { CreateCoffeeDto } from './dto/create-coffee.dto';
import { UpdateCoffeeDto } from './dto/update-coffee.dto';

@Controller('coffees')
export class CoffeesController {
  constructor(private readonly coffesService: CoffeesService) {}
  @Public()
  @Get()
  async findAll(@Query() paginationQuery: PaginationQueryDto) {
    return this.coffesService.findAll(paginationQuery);
  }
  @Get(':id')
  findOne(@Param('id', ParseIntPipe) id: number) {
    console.log(id);
    return this.coffesService.findOne('' + id);
  }
  @Post()
  create(@Body() createCoffeeDto: CreateCoffeeDto) {
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
