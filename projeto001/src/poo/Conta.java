package poo;

public class Conta {
    public Conta(int numero){
        System.out.println("Criar objeto Conta");
        setNumero(numero);
        setLimite(1000);
    }

    public boolean depositar(double valor){
        setSaldo(valor);
        return true;
    }

    public boolean sacar(double valor){
        if (valor <= getSaldo()+getLimite()){
            setSaldo(-valor);
            return true;
        }
        return false;
    }
    // comportamentos => metodos
    // tipo_retorno nome_metodo(parametros)
    public String info(){
        String estado = "--------------------" +
                        "\nNumero: " + numero + 
                        "\nCliente: " + dono +
                        "\nSaldo: R$ " + saldo +
                        "\nLimite: R$ " + limite;
        return estado;
    }
    public int getNumero() {
        return numero;
    }
    private void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    private void setSaldo(double saldo) {
        this.saldo += saldo;
    }
   
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean transferir(Conta destino, double valor){
        if (this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return info();
    }


    // atributos => caracteristicas
    private int numero;
    private double saldo;
    private String dono;
    private double limite;
}
