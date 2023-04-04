public class Conta{

    private int Numero;
    private double Salario;
    private  String Nome;

   public void setNumero (int Numero) {
    this.Numero = Numero;
   }
   public int getNumero () {
    return this.Numero;
   }

   public void setSalario (double Salario) {
    this.Salario = Salario;
   }
   public double getSalario () {
    return this.Salario;
   }

   public void setNome(String Nome) {
    this.Nome = Nome;
   }
   public String getNome () {
    return this.Nome;
   }
}