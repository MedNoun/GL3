package com.codewithmosh.composite;

public class HumanResource implements TeamUnit {

  @Override
  public void deploy() {
    System.out.println("Deploying a human resource");
  }

  
}
