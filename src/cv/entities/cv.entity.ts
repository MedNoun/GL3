import { type } from 'os';
import { Skill } from 'src/cv/entities/skill.entity';
import {
  Column,
  Entity,
  JoinTable,
  ManyToMany,
  ManyToOne,
  OneToMany,
  PrimaryColumn,
  PrimaryGeneratedColumn,
} from 'typeorm';
import { User } from './user.entity';

@Entity()
export class Cv {
  @PrimaryGeneratedColumn()
  id: number;
  @Column()
  name: string;
  @Column()
  firstname: string;
  @Column()
  age: number;
  @Column()
  cin: string;
  @Column()
  job: string;
  @Column()
  path: string;
  @JoinTable()
  @ManyToOne((type) => User, (user) => user.cv, {
    cascade: true,
  })
  user: User;
  @JoinTable()
  @ManyToMany((type) => Skill, (skill) => skill.cv, { cascade: true })
  skills: Skill[];
}
