package com.codewithmosh.abstractFactory.app;

import com.codewithmosh.abstractFactory.WidgetFactory;

public class ContactForm {
  public void render(WidgetFactory factory) {
    factory.createTextBox().render();
    factory.createButton().render();
  }
}
