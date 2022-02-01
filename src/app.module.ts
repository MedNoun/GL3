import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { CoffeesModule } from './coffees/coffees.module';
import { ServersModule } from './servers/servers.module';

@Module({
  imports: [CoffeesModule, ServersModule],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
