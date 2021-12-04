package Ex1;

import Ex1.Visitors.Visitor;

public class Parc implements ZoneTouristique {
    @Override
    public void accept(Visitor v) {
        System.out.println("Le parc a accepte votre visit! ");
        v.visitParc();
        
    }

}
