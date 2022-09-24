import entidades.Cliente;
import entidades.Documento;
import entidades.Endereco;
import entidades.Funcionario;
import entidades.PessoaFisica;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente obj1 = new Cliente("000.000.000-00");
        obj1.setNome("Joaquim");

        Funcionario fun1 = new Funcionario("111.111.111-11");
        fun1.setNome("Severino");
       
        System.out.println("---Funcionario---");
        Util.info(fun1);

        System.out.println("---Cliente---");
        Util.info(obj1);
    }
    
   

  


}
