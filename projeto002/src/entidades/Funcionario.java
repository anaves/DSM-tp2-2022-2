package entidades;

import java.time.LocalDate;

public class Funcionario extends PessoaFisica {
    
    //  atributos especificos da classe funcionario
    private double salario;
    private String matricula;

    public Funcionario(String cpf) {
        super(cpf);
    }    

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public String toString(){
        return super.toString() + "\nMatricula: " + getMatricula() + "\nSalario: " + getSalario();
    }
    
}
