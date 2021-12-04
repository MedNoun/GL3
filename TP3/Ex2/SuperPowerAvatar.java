package Ex2;

public class SuperPowerAvatar {
    String nom;
    String description;
    public SuperPowerAvatar(String nom) {
        this.nom = nom;
    }
    
    void affiche(double prix){
        System.out.println("nom: "+nom+" description: "+description + " prix : "+prix);
    }
}
