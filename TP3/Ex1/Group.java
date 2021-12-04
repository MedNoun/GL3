package Ex1;

import java.util.ArrayList;

public class Group extends Forme{
    private ArrayList<Forme> list = new ArrayList<Forme>();

    
    @Override
    double calculerSurface() {
        double sur=0;
        for(Forme a: list){
            sur = sur + a.calculerSurface();
        }

        return sur;
    }

    @Override
    String afficherCouleur() {
        for(Forme a: list){
            this.couleur = this.couleur +" " +a.couleur;
        }
        return this.couleur;
    }

    @Override
    boolean ajouteForme(Forme f) {
        try{
            list.add(f);
            return true;
        }catch(Exception e){
            return false;
        }
        
    }
    
}
