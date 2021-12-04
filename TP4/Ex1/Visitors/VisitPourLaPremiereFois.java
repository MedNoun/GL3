package Ex1.Visitors;

public class VisitPourLaPremiereFois implements Visitor{

    @Override
    public void visitVille() {
        System.out.println("Visit de ville pour la premiere fois! ");
        
    }

    @Override
    public void visitParc() {
        System.out.println("Visit de Parc pour la premiere fois! ");
        
    }

    @Override
    public void visitMuse() {
        System.out.println("Visit de muse pour la premiere fois! ");
        
    }
    
}
