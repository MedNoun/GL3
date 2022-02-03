import { Column, Entity, Index, PrimaryGeneratedColumn } from 'typeorm';

@Index(['name','type'])//index help speed up look up for the entity by name and type for expl
@Entity()
export class Event {
  @PrimaryGeneratedColumn()
  id: number;
  @Column()
  type: string;
  @Column()
  name: string;
  @Column('json')
  payload: Record<string, any>;
}
