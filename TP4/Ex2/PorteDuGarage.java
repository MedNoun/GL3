package Ex2;

import java.util.ArrayList;

import Ex2.States.DoorState;

public class PorteDuGarage {
    DoorState s;
    ArrayList<ConcreatInterface> li = new ArrayList<ConcreatInterface>();
    void addInterface(ConcreatInterface a){
        li.add(a);
    }
    void notifySubscriber(){
        for(ConcreatInterface a : li){
            a.update(this);
        }
    }
    public void nextState(DoorState d){
        notifySubscriber();
        s=d.nextState();
    }
    void open(){
        s.open();
    }
    void close(){

    }
    public DoorState getS() {
        return s;
    }
    public void setS(DoorState s) {
        this.s = s;
    }
}
