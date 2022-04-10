import { StatusEnum } from '../enums/status.enum';
import { Column, Entity, PrimaryGeneratedColumn } from 'typeorm';
import { Tiemstamp } from 'src/commun/entities/time-stamp.entity';

@Entity('todo')
export class Todo extends Tiemstamp {
  @PrimaryGeneratedColumn('uuid')
  id: string;
  @Column({})
  name: string;
  @Column({})
  description: string;
  @Column({
    type: 'enum',
    enum: StatusEnum,
    default: StatusEnum.waiting,
  })
  status: StatusEnum;
}
