package hook_method;
import java.util.Random;
public class ClasseB extends ClasseA {
    // uso do final na superclasse nao permite sobrescrita
    // public void acesso(){
    //     System.out.println("POSSO FAZER M*");
    // }
    @Override
    protected boolean validaAcesso() {
        System.out.println("VALIDA ACESSO - CLASSE B");
        Random rnd = new Random();
        if (rnd.nextDouble() < 0.5){
            return true;
        }
        return false;
    }
    
}
