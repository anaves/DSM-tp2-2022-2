package poo;

import javax.swing.JOptionPane;

public class TesteConta {
    public static void main(String[] args) {
        Conta objCC = new Conta(123);
        Conta objCP = new Conta(321);
        Conta objCV = new Conta(432);
      //  objCC.setNumero(123);
        objCC.setSaldo(2000);     
        objCC.setDono("Cebolinha");   
      //  objCP.setNumero(321);
        objCP.setSaldo(5000);
        objCP.setDono("Magali");
        System.out.println(objCC.info());
        JOptionPane.showMessageDialog(null, objCP.info());

        objCV.setDono("Franjinha");
        System.out.println("-------- REFERENCIA -----------");
        System.out.println(objCC);
        System.out.println(objCP);
        System.out.println(objCV);

    }
}
