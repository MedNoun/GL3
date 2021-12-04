package Ex2;
public class Main {
    public static void main(String args []){
        SuperPowerFactory fac = new SuperPowerFactory();
        Avatar a1 = new Avatar();
        Avatar a2 = new Avatar();
        a1.ajouteSuperPower(fac, 2, "magic");
        a1.ajouteSuperPower(fac, 3.5, "muggle");

        a2.ajouteSuperPower(fac, 5, "muggle");
        a2.ajouteSuperPower(fac, 6, "magical me");
        a1.afficheSuperPowers();
        a2.afficheSuperPowers();
        
    }
}
