import java.io.FileNotFoundException;
import java.util.List;

import Commande.Commande;
import Decorators.*;
import Models.Boisson;
import Models.Cafe;
import Models.CoupeGlacee;
import Models.Product;
import Models.TripleChocolat;

public class Main {
    public static void main(String args[]) throws FileNotFoundException{
        TripleChocolat glace = TripleChocolat.SINGLETON;
        Topping sauce = new SauceChocolat(glace);
        Topping chantille = new Chantilly(sauce);
        Boisson coffy = new Cafe("arabica");
        Topping chant = new Chantilly(coffy);

        List<Product> cg = List.of(chantille, chant);
        Commande cmd = new Commande(cg);
        cmd.publieFacture();
        
    }
}
