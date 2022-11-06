import java.util.LinkedList;

public class TesteException {
    public static void main(String[] args) {
        LinkedList <Integer> lista = new LinkedList<Integer>();   
        lista.add(3);
        lista.add(9);
        System.out.println(lista);
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("valor " + lista.get(i));
            }
            
        } catch (IndexOutOfBoundsException  e) {
            System.out.println("873-tentou acessar posicao invalida " + e.getMessage());
        } catch (NullPointerException e){
            System.out.println("lista nula " + e.getMessage() );   
        } catch (Exception e){
            System.out.println("Excecao generica");   
        }
        //finally{
        //     System.out.println("executei finally");
        // }
    
       
        System.out.println("Fim do programa");
    }
}
