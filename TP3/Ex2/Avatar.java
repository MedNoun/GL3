package Ex2;

import java.util.ArrayList;

public class Avatar {
    ArrayList<SuperPowerAvatar> supers = new ArrayList<SuperPowerAvatar>();
    ArrayList<Double> prixDeVenteSuperPowers = new ArrayList<Double>();
    void afficheSuperPowers(){  
        int index=0;      
        for(SuperPowerAvatar a : supers){
            a.affiche(prixDeVenteSuperPowers.get(index));
            index++;
        }
    }
    public void ajouteSuperPower(SuperPowerFactory factory , double prix, String nom){
        prixDeVenteSuperPowers.add(prix);
        supers.add(factory.getSuperPower(nom));
    }
}
