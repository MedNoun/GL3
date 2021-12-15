package com.codewithmosh.abstractFactory.material;

import com.codewithmosh.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
  @Override
  public void render() {
    System.out.println("Material TextBox");
  }
}
