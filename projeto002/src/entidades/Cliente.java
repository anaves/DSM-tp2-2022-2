package entidades;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private Documento documento;
    private Endereco endereco;
    private Contato contato;
    private LocalDate dataNascimento;

    public Cliente(String cpf){
        // instanciando diretamente no construtor
        this.documento = new Documento(cpf);
        this.endereco = new Endereco(null); 
        // chamando metodo para alterar (alternativa) passando instancia
        setContato(new Contato()); 
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Documento getDocumento() {
        return documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
    
}
