package poo;

import javax.swing.JOptionPane;

public class TesteConta {
    public static void main(String[] args) {
        Conta objCC = new Conta(123);
        Conta objCP = new Conta(321);
        Conta objCV = new Conta(432);
      //  objCC.setNumero(123);
      // nao utilizaremos o metodo setSaldo e sim o depositar ou sacar
        //objCC.setSaldo(2000); 
        objCC.depositar(2000); 
        objCC.setDono("Cebolinha");   
      //  objCP.setNumero(321);
        objCP.depositar(5000);
        objCP.setDono("Magali");
        System.out.println(objCC.info());
        JOptionPane.showMessageDialog(null, objCP.info());

        objCV.setDono("Franjinha");
        System.out.println("-------- REFERENCIA -----------");
        System.out.println(objCC);
        System.out.println(objCP);
        System.out.println(objCV);

        System.out.println("---Teste sacar CC - Cebolinha---");
        saque(objCC,2500);
        saque(objCC,500);
        //saque(objCC)
    }

    public static void saque(Conta conta, double valor){
      if(conta.sacar(valor)){
        System.out.println("Saque realizado");
      }else{
        System.out.println("Saldo insuficiente realizado");
        System.out.println("Valor solicitado R$ " + valor);
      }
      System.out.println(conta);

    }
}
