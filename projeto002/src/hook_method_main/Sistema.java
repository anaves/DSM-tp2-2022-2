package hook_method_main;

import java.util.Random;

import hook_method.ClasseA;
import hook_method.ClasseB;
import hook_method.ClasseC;
import hook_method.ClasseNula;

public class Sistema {
  
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
        obj.acesso();
        
        
    }
}
