package Ex2.States;



public interface DoorState {
    void open();
    void close();
    DoorState nextState();
}
