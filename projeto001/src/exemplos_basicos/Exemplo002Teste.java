package exemplos_basicos;
public class Exemplo002Teste {
    public static void main(String[] args) {
        Exemplo002 obj = new Exemplo002();
        int resultado = obj.soma(5,7);
        System.out.println(resultado);

        var resultado2 = Exemplo002.subtracao(7, 1);
        System.out.println(resultado2);

        double x = 9.49;
        System.out.println(Math.round(x));
        System.out.println(Integer.MAX_VALUE);

    }
}
