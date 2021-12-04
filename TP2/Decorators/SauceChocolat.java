package Decorators;

import Models.CoupeGlacee;
import Models.Product;

public class SauceChocolat extends Topping{
    public SauceChocolat(Product produit) {
        super(produit);
    }
    @Override
    public String description() {
        return  produit.description() + "et sa délicieuse sauce chocolat ";
    }
    @Override
    public float cout() {
        return 0.7f + produit.cout();
    }
}
