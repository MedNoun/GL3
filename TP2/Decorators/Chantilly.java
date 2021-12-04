package Decorators;

import Models.CoupeGlacee;
import Models.Product;

public class Chantilly extends Topping{

    public Chantilly(Product produit) {
        super(produit);
    }

    @Override
    public String description() {
        return produit.description() + "chantilly ";
    }

    @Override
    public float cout() {
        return produit.cout() + 0.5f ;
    }
}
