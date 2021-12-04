package Ex1;

public abstract class Forme{ 

  protected double surface= 55.0; 
  protected String couleur;
  public Forme(){
  }
  public Forme(String color){
    this.couleur = color;
  } 

  public void ajouteCouleur(String couleur){ 
    this.couleur=couleur; 
  }
  abstract double calculerSurface(); 
  abstract String afficherCouleur(); 
  abstract boolean ajouteForme(Forme f); 
  
} 