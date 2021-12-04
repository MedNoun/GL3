package Ex2.States;

import Ex2.PorteDuGarage;

public class Closing implements DoorState {

    PorteDuGarage p;


    
    @Override
    public void open() {
        System.out.print("Requesting to open door after closing");
        p.nextState(this);
        
    }

    @Override
    public void close() {
        System.out.print("ERROR la porte est deja en fermeture");
        
    }

    @Override
    public DoorState nextState() {
        return null;
        // TODO Auto-generated method stub
        
    }
    
}
