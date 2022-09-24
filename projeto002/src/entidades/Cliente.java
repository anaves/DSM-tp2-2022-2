package entidades;



public class Cliente extends PessoaFisica {
   private int scoreCredito;

   public int getScoreCredito() {
       return scoreCredito;
   }

   public void setScoreCredito(int scoreCredito){
       this.scoreCredito = scoreCredito;
   }
  
   public String toString(){
       return super.toString() + "\nScore: " + getScoreCredito();
   }
    
}
