public class Sobrecarga {
    public static double soma(int a, int b) {
        System.out.println("metodo 1");
        return (double)(a+b); // int 2 double - cast
    }

    public static double soma(double a, int b){
        System.out.println("metodo 2");
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(soma(2,3));
        System.out.println(soma(2.0, 3));
        char vetor[] = {'f','a','t','e','c'};
        System.out.println(vetor);
        String palavra = String.copyValueOf(vetor);
        System.out.println(palavra.toUpperCase());
        String palavra2 = String.copyValueOf(vetor, 1, 3);
        System.out.println(palavra2);
    }
}