import { Cv } from 'src/cv/entities/cv.entity';
import {
  Column,
  Entity,
  ManyToMany,
  PrimaryGeneratedColumn,
} from 'typeorm';

@Entity()
export class Skill {
  @PrimaryGeneratedColumn()
  id: number;
  @Column({ nullable: false })
  designation: string;
  @ManyToMany((type) => Cv, (cv) => cv.skills)
  cv: Cv[];
}
