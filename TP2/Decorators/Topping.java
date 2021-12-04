package Decorators;

import Models.CoupeGlacee;
import Models.Product;

public class Topping extends CoupeGlacee {
    protected Product produit;

    public Topping(Product produit) {
        this.produit = produit;
    }

    @Override
    public String description() {
        return produit.description();
    }

    @Override
    public float cout() {
        return produit.cout();
    }
}
