import { Injectable, NotFoundException } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { Cv } from 'src/cv/entities/cv.entity';
import { Repository } from 'typeorm';
import { CreateSkillDto } from './dto/create-skill.dto';
import { UpdateSkillDto } from './dto/update-skill.dto';
import { Skill } from './entities/skill.entity';

@Injectable()
export class SkillService {
  constructor(
    @InjectRepository(Skill)
    private readonly skillrepository: Repository<Skill>,
    @InjectRepository(Cv)
    private readonly cvRepository: Repository<Cv>,
  ) {}

  async create(createSkillDto: CreateSkillDto) {
    const cv: Cv[] = await Promise.all(
      createSkillDto.cv.map((item) => this.preloadCvsFromId(item)),
    );
    const skill: Skill = await this.skillrepository.create({
      ...createSkillDto,
      cv,
    });
    return this.skillrepository.save(skill);
  }
  private async preloadCvsFromId(id: string): Promise<Cv> {
    return await this.cvRepository.findOne(id);
  }

  findAll() {
    return this.skillrepository.find();
  }

  findOne(id: string) {
    return this.skillrepository.findOne(id);
  }

  async update(id: number, updateSkillDto: UpdateSkillDto) {
    const cv: Cv[] =
      updateSkillDto.cv &&
      (await Promise.all(
        updateSkillDto.cv.map((e) => {
          return this.cvRepository.findOne(e);
        }),
      ));

    const newSkill: Skill = await this.skillrepository.preload({
      id,
      designation: updateSkillDto.designation,
      ...cv,
    });
    if (newSkill) {
      return this.skillrepository.save(newSkill);
    } else {
      throw new NotFoundException(`Le skill d'id ${id} n'existe pas `);
    }
  }

  remove(id: number) {
    return this.skillrepository.softDelete(id);
  }
}
