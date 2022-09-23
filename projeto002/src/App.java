import entidades.Cliente;
import entidades.Documento;
import entidades.Endereco;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente obj1 = new Cliente("111.444.777-35");
        obj1.getDocumento().setCnh("192837467");
        obj1.getDocumento().setRg("10.231.234");
        // definir os valores correspondente ao endereco, contato e nome de um cliente.
        obj1.getDocumento().setRg("11.111.234");
        obj1.getEndereco().setCep("12.345-000");
        obj1.getEndereco().setBairro("Centro");
        obj1.getEndereco().setCidade("Franca");
        obj1.getEndereco().setLogradouro("Rua");
        obj1.getEndereco().setNome("Rua da Fatec");
        obj1.getEndereco().setNumero("0");
        obj1.getEndereco().setUf("SP");
        obj1.getContato().setCelular("(00)0000-0000");
        obj1.getContato().setEmail("fulano@fulano.com.br");
        obj1.getContato().setFixo("(11)1111-1111");

        //obj1.setEndereco(new Endereco("37.950-000"));
        System.out.println(obj1);

        System.out.println("FIM");

    }
}
