import { type } from 'os';
import { Skill } from 'src/cv/entities/skill.entity';
import { User } from 'src/user/entities/user.entity';
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

@Entity()
export class Cv {
  @PrimaryGeneratedColumn()
  id: string;
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
  @OneToMany((type) => User, (user) => user.cv, {
    cascade: true,
  })
  user: User;
  @JoinTable()
  @ManyToMany((type) => Skill, (skill) => skill.cv, { cascade: true })
  skills: Skill[];
}
