import { ParseIntPipe, ValidationPipe } from '@nestjs/common';
import { NestFactory } from '@nestjs/core';
import { AppModule } from './app.module';
import { HttpExceptionFilter } from './common/filters/http-exception.filter';
import { ApiKeyGuard } from './common/guards/api-key.guard';
import { TimoutInterceptor } from './common/interceptors/timout.interceptor';
import { WrapResponseInterceptor } from './common/interceptors/wrap-response.interceptor';

async function bootstrap() {
  const app = await NestFactory.create(AppModule);
  app.useGlobalFilters(new HttpExceptionFilter());
  app.useGlobalInterceptors(
    new WrapResponseInterceptor(),
    new TimoutInterceptor(),
  );
  app.useGlobalPipes(
    new ValidationPipe({
      whitelist: true, //removes the non listed
      transform: true, //transforms the body to the dto ( instance of dto ) also transforms primitive objects if possible (from String to number for example)
      forbidNonWhitelisted: true, //responds with error
      transformOptions: {
        enableImplicitConversion: true,
      },
    }),
  );
  await app.listen(3000);
}
bootstrap();
