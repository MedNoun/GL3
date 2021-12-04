import Ex3Ds2016.Env.ClassicEnv;
import Ex3Ds2016.Env.Environment;
import Ex3Ds2016.Env.Decorators.Color;
import Ex3Ds2016.Env.Decorators.Thickness;
import Ex3Ds2016.Figures.Cercle;
import Ex3Ds2016.Figures.Figure;
import Ex3Ds2016.Figures.Rectangle;

public class Main {
    public static void main(String args []){
        Environment e = new Thickness(new Color("Blue",new ClassicEnv()));
        Figure cercle = new Rectangle(e);
        System.out.println(cercle.dessiner());

    }
}
