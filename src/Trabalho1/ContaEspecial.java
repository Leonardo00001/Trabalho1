package Trabalho1;

public class ContaEspecial extends Contas {

    int limite;

    public double descontar(double multa) {
    return this.saldo = (this.saldo-limite)*(multa/100)+(this.saldo-limite);
   }
  

    public String tipoConta() {
        return "Conta-Especial";
    }
}
