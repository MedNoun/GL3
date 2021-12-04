package Ex3Ds2016.Env.Decorators;

import Ex3Ds2016.Env.Environment;

public class Color extends Environment{
    String color;
    Environment e;

    public Color(String color, Environment e) {
        this.color = color;
        this.e = e;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String dessiner() {
        
        return e.dessiner() + ",avec la couleur "+color;
    }
    
}
