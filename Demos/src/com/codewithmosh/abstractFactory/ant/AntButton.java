package com.codewithmosh.abstractFactory.ant;

import com.codewithmosh.abstractFactory.Button;

public class AntButton implements Button {
  @Override
  public void render() {
    System.out.println("Ant Button");
  }
}
