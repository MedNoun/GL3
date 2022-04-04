import { Module } from '@nestjs/common';
import { CvService } from './cv.service';
import { CvController } from './cv.controller';
import { Cv } from './entities/cv.entity';
import { TypeOrmModule } from '@nestjs/typeorm';
import { Skill } from './entities/skill.entity';
import { SkillController } from './skill.controller';
import { SkillService } from './skill.service';
import { User } from './entities/user.entity';
import { UserService } from './user.service';
import { UserController } from './user.controller';

@Module({
  imports: [TypeOrmModule.forFeature([Cv, Skill, User])],
  controllers: [CvController, SkillController, UserController],
  providers: [CvService, SkillService, UserService],
})
export class ManagingModule {}
