package polimorfismo;
import java.util.Random;
public class ClasseB extends ClasseA {

    @Override
    public boolean validaAcesso() {
        System.out.println("VALIDA ACESSO - CLASSE B");
        Random rnd = new Random();
        if (rnd.nextDouble() < 0.5){
            return true;
        }
        return false;
    }
    
}
