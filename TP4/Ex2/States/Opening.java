package Ex2.States;

import Ex2.PorteDuGarage;

public class Opening implements DoorState {

    PorteDuGarage p;
    

    public Opening(PorteDuGarage p) {
        this.p = p;
    }

    @Override
    public void open() {
        System.out.println("EROOR CANNOT OPEN OPENED DOOR !!! ");
        
    }

    @Override
    public void close() {
        System.out.println("Requesting to close Opening door !");
        p.setS(this);
        
    }

    @Override
    public DoorState nextState() {
        p.setS(new Open());
        return null;
        
    }

    public PorteDuGarage getP() {
        return p;
    }

    public void setP(PorteDuGarage p) {
        this.p = p;
    }
    
}
