package Models;

public class Cafe extends Boisson {

    private String variety;
    public Cafe(String variety) {
        this.variety = variety;
    }
    @Override
    public String description(){
        return "Café " + variety+" ";
    }
    @Override
    public float cout() {
        return 1.5f;
    }

    
}
