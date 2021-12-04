package Ex1;
public class Main {
    public static void main(String[] args){
        Forme tri = new Triangle(15, 2, "jaune");
        Forme rec = new Rectangle(15, 2, "jaune");
        Forme gr = new Group();
        gr.ajouteForme(rec);
        gr.ajouteForme(tri);
        System.out.println(gr.calculerSurface());
        System.out.println(gr.afficherCouleur());
    }
    
}
