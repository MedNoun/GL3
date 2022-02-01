import {
  Column,
  Entity,
  JoinTable,
  ManyToMany,
  PrimaryGeneratedColumn,
} from 'typeorm';
import { Flavor } from './flavor.entity';

// sql table === coffee you can specify the name in the entity as a parameter

@Entity()
export class Coffee {
  @PrimaryGeneratedColumn()
  id: number;
  @Column()
  name: string;
  @Column()
  brand: string;
  @JoinTable()
  @ManyToMany((type) => Flavor, (flavor) => flavor.coffees, {
    cascade: true, // insert and update we can limit : ['insert']
  })
  flavors: Flavor[];
}
