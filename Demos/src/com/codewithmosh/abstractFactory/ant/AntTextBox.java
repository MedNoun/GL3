package com.codewithmosh.abstractFactory.ant;

import com.codewithmosh.abstractFactory.TextBox;

public class AntTextBox implements TextBox {
  @Override
  public void render() {
    System.out.println("Ant TextBox");
  }
}
