package entidades;

public class Documento {
    private String rg;
    private String cpf;
    private String cnh;

    public Documento(String cpf){
        if (validaCpf(cpf)){
            setCpf(cpf);
        }else{
            System.out.println("CPF invalido");
            System.exit(-1);
        }
        
    }

    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCnh() {
        return cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    // github.com/anaves/DSM-tp2-2022-2

    private boolean calculaCPF(String cpf, int posicao){
        int dv = Character.getNumericValue(cpf.charAt(posicao)); // converte para int
        // 9 - dv1 ----   (11-9) = 2     --- 10
        // 10 - dv2       (11-10) =  1     --- 11
        int soma = 0;        
        for (int i = 0; i < cpf.length()-(11-posicao); i++) {
            // converter de char para int
            int digito = Character.getNumericValue(cpf.charAt(i)); 
            soma = soma + digito*((posicao+1)-i);
        }
        int resto = soma%11;
        if ((resto < 2)&&(dv!=0)){
            return false;
        }else if ((resto >=2)&&(dv!=(11-resto))){            
            return false;
        }
        
        return true;
    }

    private boolean validaCpf(String cpf){
        cpf = cpf.replace(".", ""); // substituir . por string vazia
        cpf = cpf.replace("-", "");  
        // posicao 9 para analisar dv1
        // posicao 10 para analisar dv2      
        return (calculaCPF(cpf, 9) && calculaCPF(cpf, 10));
    }

    public static void main(String[] args) {
        Documento doc = new Documento("111.444.787-35");
    }

    
}
