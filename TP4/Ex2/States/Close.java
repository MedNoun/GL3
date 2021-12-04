package Ex2.States;

import Ex2.PorteDuGarage;

public class Close implements DoorState {

    PorteDuGarage p;
        

    public Close(PorteDuGarage p) {
        this.p = p;
    }

    @Override
    public void open() {
        System.out.println("opening the door");
        p.nextState(this);
        
    }

    @Override
    public void close() {
        System.out.println("EROOR CANNOT CLOSE CLOSED DOOR !!");
        
    }

    @Override
    public DoorState nextState() {
        p.setS(new Opening(p));
        return p.getS();
        
    }

    public PorteDuGarage getP() {
        return p;
    }

    public void setP(PorteDuGarage p) {
        this.p = p;
    }
    
}
