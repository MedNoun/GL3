package Ex1;

import Ex1.Visitors.VisitPourLaPremiereFois;
import Ex1.Visitors.VisitPourSouvenir;
import Ex1.Visitors.Visitor;

public class Main {
    public static void main(String args[]){
        Ville villaa = new Ville();
        villaa.addLi(new Muse());
        villaa.addLi(new Parc());
        Ville villa2 = new Ville();
        villa2.addLi(new Muse());
        villaa.addLi(villa2);
        Visitor v1 = new VisitPourSouvenir();
        Visitor v2 = new VisitPourLaPremiereFois();
        villaa.accept(v2);
        villaa.accept(v1);
        
    }
}
