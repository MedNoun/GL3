package com.codewithmosh.abstractFactory.material;

import com.codewithmosh.abstractFactory.Button;
import com.codewithmosh.abstractFactory.TextBox;
import com.codewithmosh.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
  @Override
  public Button createButton() {
    return new MaterialButton();
  }

  @Override
  public TextBox createTextBox() {
    return new MaterialTextBox();
  }
}
