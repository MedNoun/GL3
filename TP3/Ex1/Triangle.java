package Ex1;

public class Triangle extends Forme {
    double base;
    public Triangle(double base, double hauteur, String color) {
        super(color);
        this.base = base;
        this.hauteur = hauteur;
    }

    double hauteur;

    @Override
    double calculerSurface() {
        return base*hauteur/2;
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
