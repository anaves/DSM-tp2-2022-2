package polimorfismo;

import java.util.Random;

public class Sistema {
    public static void acesso(ClasseA obj){
        //if (obj != null){
        if (obj.validaAcesso()){
            System.out.println("ACESSO PERMITIDO");
        }else{
            System.out.println("ACESSO NEGADO");
        }
        //}else{
        //    System.out.println("objeto nulo");
        ///}

    }
    public static ClasseA classeAFactory(){
        Random random = new Random();
        double valor = random.nextDouble();
        System.out.println("Sorteou " + valor);
        if ( valor < 0.33){
            return new ClasseB();
        } else if(valor < 0.66){
            return new ClasseC();
        } else{ // >= 0.66
            return new ClasseNula(); //null;
        }
    }
    public static void main(String[] args) {
        ClasseA obj = classeAFactory();
        acesso(obj);
        
    }
}
