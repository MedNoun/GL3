package Ex1;

import Ex1.Visitors.Visitor;

public class Muse implements ZoneTouristique{

    @Override
    public void accept(Visitor v) {
        System.out.println("Le muse a accepte votre visit! ");
        v.visitMuse();
        
    }
    
}
