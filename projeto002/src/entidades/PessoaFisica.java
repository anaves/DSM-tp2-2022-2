package entidades;

import java.time.LocalDate;

public class PessoaFisica {
    private String nome;
    private Endereco endereco;
    private Documento documento;
    private Contato contato;
    private LocalDate dataNascimento;
    
    public String getNome() {
        return nome;
    }
    /**
     * Metodo que permite alterar atributo nome
     * @param nome corresponde ao nome da PF
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Documento getDocumento() {
        return documento;
    }
    public void setDocumento(Documento documento) {
        this.documento = documento;
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

    public String toString(){
        return "Nome: " + getNome() + "\nEndereco: " + getEndereco() +
        "\nContato: " + getContato() +
        "\nDocumento: " + getDocumento() +
        "\nData de Nascimento: " + getDataNascimento();
    }
    
}
