import { Injectable } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { Repository } from 'typeorm';
import { CreateCvDto } from './dto/create-cv.dto';
import { UpdateCvDto } from './dto/update-cv.dto';
import { Cv } from './entities/cv.entity';
import { Skill } from './entities/skill.entity';

@Injectable()
export class CvService {
  constructor(
    @InjectRepository(Cv)
    private readonly cvrepository: Repository<Cv>,
    @InjectRepository(Skill)
    private readonly skillRepository: Repository<Skill>,
  ) {}
  async create(createCvDto: CreateCvDto) {
    const skills: Skill[] = await Promise.all(
      createCvDto.designation.map((item) =>
        this.preloadDesignationByName(item),
      ),
    );
    const cv: Cv = await this.cvrepository.create({
      ...createCvDto,
      skills,
    });
    return this.cvrepository.save(cv);
  }
  async preloadDesignationByName(designation: string): Promise<Skill> {
    const skill = await this.skillRepository.findOne({ designation });
    return skill ? skill : this.skillRepository.create({ designation, cv: [] });
  }

  findAll() {
    return this.cvrepository.find();
  }

  async findOne(id: string) {
    return await this.cvrepository.findOne(id);
  }

  update(id: number, updateCvDto: UpdateCvDto) {
    return `This action updates a #${id} cv`;
  }

  remove(id: number) {
    return `This action removes a #${id} cv`;
  }
}
