package com.codewithmosh.abstractFactory.ant;

import com.codewithmosh.abstractFactory.Button;
import com.codewithmosh.abstractFactory.TextBox;
import com.codewithmosh.abstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
  @Override
  public Button createButton() {
    return new AntButton();
  }

  @Override
  public TextBox createTextBox() {
    return new AntTextBox();
  }
}
