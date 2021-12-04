package Ex2;

import java.util.Map;
import java.util.TreeMap;

public class SuperPowerFactory {
    Map<String, SuperPowerAvatar> list = new TreeMap<String, SuperPowerAvatar>();
    public SuperPowerAvatar getSuperPower(String nom){
        if(!list.containsKey(nom)){
            list.put(nom,new SuperPowerAvatar(nom));
        }
        return list.get(nom);
    }
    
    
}
