import { userInfo } from 'os';
import { Cv } from 'src/cv/entities/cv.entity';
import {
  Column,
  Entity,
  ManyToOne,
  OneToMany,
  PrimaryGeneratedColumn,
} from 'typeorm';

@Entity()
export class User {
  @PrimaryGeneratedColumn()
  id: number;
  @Column({ nullable: false })
  username: string;
  @Column()
  email: string;
  @Column()
  password: string;
  @OneToMany((type) => Cv, (cv) => cv.user)
  cv: Cv[];
}
