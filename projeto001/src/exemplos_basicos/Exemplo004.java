package exemplos_basicos;
public class Exemplo004 {
    public static void main(String[] args) {
        for (int j=0; j<10;j++){
            System.out.println("j: " + j);
            for (int i=0; i<10; i++){
                if (i==6){
                    break;
                }
                System.out.println("i: " + i);
            }
        }
    }
}
