import entidades.PessoaFisica;

public class Teste{
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("000.000.000-00");
        pf.getNome();
        System.out.println("Ola mundo");
    }
}