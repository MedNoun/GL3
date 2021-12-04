package Commande;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import Models.Product;

public class Commande{
     List<Product> lesProducts;

    public Commande(List<Product> lesProducts) {
        this.lesProducts = lesProducts;
    }

    public void publieFacture() throws FileNotFoundException { 
        

            float total = 0; 
            PrintWriter writer = new PrintWriter("command.txt");
            for (Iterator it = this.lesProducts.iterator(); it.hasNext();) { 
                Product coupe = (Product) it.next();
                System.out.println(coupe.description()+" + "+coupe.cout());
                writer.println(coupe.description()+" + "+coupe.cout()); 
                total = total + coupe.cout(); 
            } 
            System.out.println(total);
            
            writer.println(" TOTAL : "+total); 
        
        } 
}
