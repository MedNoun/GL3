import { userInfo } from 'os';
import { Cv } from 'src/cv/entities/cv.entity';
import {
  Column,
  Entity,
  ManyToOne,
  PrimaryColumn,
  PrimaryGeneratedColumn,
} from 'typeorm';

@Entity()
export class User {
  @PrimaryGeneratedColumn()
  id: string;
  @Column({ nullable: false })
  username: string;
  @Column()
  email: string;
  @Column()
  password: string;
  @ManyToOne((type) => Cv)
  cv: Cv;
}
