
package Trabalho1;


public class Contas {
    
    private String nome;
    private int numero;
    double saldo;
    
    public Contas()
    {
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
      public double depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("valor " + saldo);
        return saldo;
    }
          public double sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("valor " + saldo);
            return saldo;
        } else {
            System.out.println("Saldo insuficiente");
            return 0;
        }
          }
          
      public String tipoConta(){
          return "Conta-Comum";
    }
     
    
    
}
