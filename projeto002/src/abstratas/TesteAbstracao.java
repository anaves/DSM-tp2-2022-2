package abstratas;

import java.util.LinkedList;

public class TesteAbstracao {
    public static void canvas(Forma f) {
        System.out.println("---canvas---");
        System.out.println(f.desenhar());
    }

    public static void main(String[] args) {
        //Forma obj = new Forma(); 
        LinkedList<Forma> bd = new LinkedList<Forma>();
        
    }
}
