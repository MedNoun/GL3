import { Module } from '@nestjs/common';
import { ConfigModule } from '@nestjs/config';
import { APP_GUARD } from '@nestjs/core';
import { ApiKeyGuard } from './guards/api-key.guard';

@Module({
  providers: [{ provide: APP_GUARD, useClass: ApiKeyGuard }],
  imports: [ConfigModule],
})
export class CommonModule {}
