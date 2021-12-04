package Ex2;

public class ConcreatInterface implements GraphicalInterface {
    PorteDuGarage p;
    @Override
    public void update(PorteDuGarage a) {
        p =a ;
        System.out.println("updating and rendering new state !");
    }
    
}
