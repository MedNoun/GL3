package Models;

import java.util.Iterator;

public abstract class Boisson implements Product{
    public abstract float cout();
    public String description(){
        
        return "Boisson ";
    }

    
}
