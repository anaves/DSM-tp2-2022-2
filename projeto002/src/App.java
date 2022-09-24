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
       
        System.out.println("---Funcionario---");
        Util.info(fun1);

        System.out.println("---Cliente---");
        Util.info(obj1);
    }
    
   

  


}
