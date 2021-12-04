package Ex3Ds2016.Env.Decorators;

import Ex3Ds2016.Env.Environment;

public class Thickness extends Environment{
    Environment e;

    public Thickness(Environment e) {
        this.e = e;
    }

    @Override
    public String dessiner() {
        return e.dessiner() + ",trais épais ";
    }
    

}
