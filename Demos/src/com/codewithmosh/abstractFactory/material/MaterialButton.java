package com.codewithmosh.abstractFactory.material;

import com.codewithmosh.abstractFactory.Button;

public class MaterialButton implements Button {
  @Override
  public void render() {
    System.out.println("Material Button");
  }
}
