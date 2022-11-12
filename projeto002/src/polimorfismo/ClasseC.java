package polimorfismo;

import javax.swing.JOptionPane;

public class ClasseC extends ClasseA{

    @Override
    public boolean validaAcesso() {
        System.out.println("VALIDA ACESSO - CLASSE C");

        String chave = "sexta-feira";
        String digitado = JOptionPane.showInputDialog(null, "Digite a senha: ");
        if (digitado.equals(chave)){
            return true;
        }
        return false;
    }
    
}
