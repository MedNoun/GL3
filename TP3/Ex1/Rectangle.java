package Ex1;

public class Rectangle extends Forme {
    double hauteur;
    double largeur;
    public Rectangle(double largeur, double hauteur, String color) {
        super(color);
        this.hauteur = hauteur;
        this.largeur = largeur;
    }


    @Override
    double calculerSurface() {
        return largeur*hauteur;
    }

    @Override
    String afficherCouleur() {
        return this.couleur;
    }

    @Override
    boolean ajouteForme(Forme f) {
        return false;
    }
    
}
