package poo;

public class TesteTransferencia {
    public static void main(String[] args) {
        Conta conta1 = new Conta(123);
        conta1.depositar(2000);
        conta1.setDono("Cebolinha");
        /////////
        Conta conta2 = new Conta(321);
        conta2.depositar(3000);
        conta2.setDono("Magali");
        /////////
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println("---Transferencia---");
        conta1.transferir(conta2, 500);  
        System.out.println(conta1);
        System.out.println(conta2);      
    }
}
