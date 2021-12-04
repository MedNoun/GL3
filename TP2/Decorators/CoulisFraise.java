package Decorators;

import Models.CoupeGlacee;
import Models.Product;

public class CoulisFraise extends Topping{
    public CoulisFraise(Product produit) {
        super(produit);
    }

    @Override
    public String description() {
        return produit.description() +"au colis de fraises fraiches ";
    }

    @Override
    public float cout() {
        return 1 + produit.cout() ;
    }
}
