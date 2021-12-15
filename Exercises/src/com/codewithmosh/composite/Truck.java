package com.codewithmosh.composite;

public class Truck implements TeamUnit{
  @Override
  public void deploy() {
    System.out.println("Deploying a truck");
  }
}
