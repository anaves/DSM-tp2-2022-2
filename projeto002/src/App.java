import entidades.Cliente;
import entidades.Documento;
import entidades.Endereco;
import entidades.Funcionario;
import entidades.PessoaFisica;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente obj1 = new Cliente();
        obj1.setNome("Joaquim");

        Funcionario fun1 = new Funcionario();
        fun1.setNome("Severino");
       
        info(fun1);
        info(obj1);
    }
    
    public static void info(PessoaFisica pf){           
        System.out.println("Nome " + pf.toString());
    }

  


}
