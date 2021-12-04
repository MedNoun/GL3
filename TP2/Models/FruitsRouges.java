package Models;
public class FruitsRouges extends CoupeGlacee {
    public static final FruitsRouges SINGLETON = new FruitsRouges();
    private FruitsRouges() {
        this.parfums.add(Parfum.FRAISE);
        this.parfums.add(Parfum.FRAMBOISE);
        this.parfums.add(Parfum.CASSIS);
    }

    @Override
    public String description() {
        return "Coupe fraise framboise cassis";
    }

    @Override
    public float cout() {
        return 5.5f;
    }
}
