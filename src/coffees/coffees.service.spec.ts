import { Test, TestingModule } from '@nestjs/testing';
import { getRepositoryToken } from '@nestjs/typeorm';
import { Connection } from 'typeorm';
import { CoffeesService } from './coffees.service';
import { Coffee } from './entities/coffee.entity';
import { Flavor } from './entities/flavor.entity';

describe('coffeesService', () => {
  let service: CoffeesService;
  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      providers: [
        CoffeesService,
        { provide: Connection, useValue: {} },
        { provide: getRepositoryToken(Flavor), useValue: {} },
        { provide: getRepositoryToken(Coffee), useValue: {} },
      ],
    }).compile();
    service = module.get<CoffeesService>(CoffeesService);
  });
  it('sould be defined', () => {
    expect(service).toBeDefined();
  });
  describe('findOne', () => {
    describe('when coffe with ID exists', () => {
      it('sould return the coffee object', async () => {});
    });
    describe('otherwise', () => {
      it('sould throw the not found exception', async () => {});
    });
  });
});
