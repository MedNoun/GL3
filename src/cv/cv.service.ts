import { Injectable, NotFoundException } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { Repository } from 'typeorm';
import { CreateCvDto } from './dto/create-cv.dto';
import { UpdateCvDto } from './dto/update-cv.dto';
import { Cv } from './entities/cv.entity';
import { Skill } from './entities/skill.entity';
import { User } from './entities/user.entity';

@Injectable()
export class CvService {
  constructor(
    @InjectRepository(Cv)
    private readonly cvrepository: Repository<Cv>,
    @InjectRepository(Skill)
    private readonly skillRepository: Repository<Skill>,
    @InjectRepository(User)
    private readonly userRepository: Repository<User>,
  ) {}
  async create(createCvDto: CreateCvDto) {
    const skills: Skill[] = await Promise.all(
      createCvDto.designation.map((item) =>
        this.preloadDesignationByName(item),
      ),
    );
    const user: User = await this.userRepository.findOne(+createCvDto.idUser);
    if (user) {
      let obj = { ...createCvDto, skills, user };
      const cv: Cv = await this.cvrepository.create(obj);
      return this.cvrepository.save(cv);
    }
    return new NotFoundException(
      `user with id : ${createCvDto.idUser} not found ! `,
    );
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
    return this.cvrepository.softDelete(id);
  }
}
