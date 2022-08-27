package exemplos_basicos;
public class Exemplo002 {
    int soma(int a, int b){
        return a+b;
    }
    static int subtracao(int a, int b){
        return a-b;
    }
    
    public static void main(String[] args) {
        Exemplo002 obj = new Exemplo002();
        int resultado = obj.soma(5,8);
        System.out.println(resultado);
        int resultado2 = subtracao(8, 2);
        System.out.println(resultado2);
    }
}
