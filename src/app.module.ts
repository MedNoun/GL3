import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { CoffeesModule } from './coffees/coffees.module';
import { TypeOrmModule } from '@nestjs/typeorm';

@Module({
  imports: [
    CoffeesModule,
    TypeOrmModule.forRoot({
      type: 'postgres',
      host: 'localhost',
      port: 5432,
      username: 'postgres',
      password: 'pass123',
      database: 'postgres',
      autoLoadEntities: true,//load modules automatically instead of specifying the entities array
      synchronize: true, //automatically generates a SQL table from all classes with @entity decorator but only for development only disable it in production
      //synchronizes the typeORM entities with the database every time
    }),
  ],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
