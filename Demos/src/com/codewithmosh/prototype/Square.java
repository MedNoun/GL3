package com.codewithmosh.prototype;

public class Square implements Component {

    private int x;
    private int y;
    public void setX(int a){
        x=a;

    }
    public void setY(int a){
        y=a;

    }
    @Override
    public void render() {
        System.out.println("rendering a square ! ");
        
    }

    @Override
    public Component clone() {

        System.out.println("Cloning a square");
        Square new_square = new Square();
        new_square.setX(x);
        new_square.setY(y);
        
        return new_square;
    }

    
}
