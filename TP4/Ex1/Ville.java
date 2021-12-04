package Ex1;

import java.util.ArrayList;

import Ex1.Visitors.Visitor;

public class Ville implements ZoneTouristique{
    ArrayList<ZoneTouristique> li = new ArrayList<ZoneTouristique>();

    @Override
    public void accept(Visitor v) {

        System.out.println("Le ville a accepte votre visit! ");
        v.visitVille();
        for(ZoneTouristique a: li){
            a.accept(v);
        }
        
    }

    public ArrayList<ZoneTouristique> getLi() {
        return li;
    }

    public void addLi(ZoneTouristique el) {
        li.add(el);
    }

}
