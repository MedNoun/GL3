package Ex3Ds2016.Figures;

import Ex3Ds2016.Env.Environment;

public abstract class Figure{
    Environment e;
    public Figure(Environment e) {
        this.e = e;
    }
    abstract public String dessiner();
}