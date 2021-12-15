package com.codewithmosh.prototype;

public class ContextMenu {
  public Component duplicate(Component component) {
    Component newComponent = component.clone();
    return newComponent;
    // Add target to our document
  }
  public void render(Component c){
    c.render();
  }
}
