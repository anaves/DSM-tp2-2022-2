package hook_method;

public abstract class ClasseA {
    public final void acesso(){
        System.out.println("-----VERIFICAR ACESSO-----");
        if (validaAcesso()){
            System.out.println("ACESSO PERMITIDO");
        }else{
            System.out.println("ACESSO NEGADO");
        }
    }
    // hook method
    protected abstract boolean validaAcesso();
}
