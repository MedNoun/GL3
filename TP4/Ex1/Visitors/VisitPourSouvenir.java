package Ex1.Visitors;

public class VisitPourSouvenir implements Visitor{

    @Override
    public void visitVille() {
        System.out.println("Achat de souvenir de la ville ! ");
        
    }

    @Override
    public void visitParc() {
        System.out.println("Achat de souvenir du parc ! ");
        
    }

    @Override
    public void visitMuse() {
        System.out.println("Achat de souvenir du muse ! ");
        
    }
    
}
