package Ex3Ds2016.Figures;

import Ex3Ds2016.Env.Environment;

public class Cercle extends Figure{

    public Cercle(Environment e) {
        super(e);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String dessiner() {
        return this.e.dessiner()+": cercle";        
    }
    
}
