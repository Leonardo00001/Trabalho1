package Trabalho1;

public class ContaPoupanca extends Contas {

    public double reajustar(double taxa) {
        double saldoAtual = this.getSaldo();
        double reajuste = saldoAtual * (taxa/100) + saldoAtual;
        return reajuste;

    }

    public double reajustar() {
        double saldoAtual = this.getSaldo();
        double reajuste = (saldoAtual * 0.1) + saldoAtual ;//0.1 = 10%
        return reajuste;

    }

    public String tipoConta() {
        return "Conta-Poupança";

    }
}
