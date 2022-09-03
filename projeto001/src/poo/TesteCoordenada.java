package poo;

public class TesteCoordenada {
    public static void main(String[] args) {
        Coordenada c1 = new Coordenada();
        Coordenada c2 = new Coordenada();
        Coordenada c3 = c1;
        // alterando atributos de c1
        c1.setX(10);
        c1.setY(15);
        c1.setZ(20);
        // alterando atributos de c2
        c2.setX(10);
        c2.setY(15);
        c2.setZ(20);
        // alterando atributos de c2
        c3.setX(11);
        c3.setY(16);
        c3.setZ(21);
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);        
        System.out.println(c1 == c2);  
        System.out.println(c1 == c3);
        double d = 5.2;   
        double e = 5.2;
        System.out.println(d==e);   
    }
}
