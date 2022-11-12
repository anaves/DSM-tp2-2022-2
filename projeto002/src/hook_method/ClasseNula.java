package hook_method;

public class ClasseNula extends ClasseA {

    @Override
    protected boolean validaAcesso() {
        // TODO Auto-generated method stub
        System.out.println("VALIDA ACESSO - CLASSE NULO");
        return false;
    }
    
}
