package com.codewithmosh.prototype;

public class Circle implements Component {
  private int radius;

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }


  @Override
  public void render() {
    System.out.println("Rendering a circle");
  }

  @Override
  public Component clone() {
    
    System.out.println("Copying a circle");
    Circle newCircle = new Circle();
    newCircle.setRadius(radius);
    return newCircle;
  }
}
