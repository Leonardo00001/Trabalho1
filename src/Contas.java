
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samsung
 */
public class Contas {
    
   private String nome;
   private int numero;
   double saldo;
   double saque;

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
    
    double depositar (double deposito){
        
        saldo += deposito;
        return saldo;
    }
    
    double sacar (double saque){
        
        this.saque = saque;
        
        if (saque>0 && saque<=saldo){
            saldo -= saque;
            return saldo;
        }
        else{
            System.out.println("Saldo insuficiente");
            return 0;
        }
    }
    
    double transferir (Contas conta1, Contas conta2, double valor){
        
        if (conta1.saldo >=0 && conta2.saldo >=0 && conta1.saldo >= valor){
            conta1.sacar(valor);
            conta2.depositar(valor);
            
            return saldo;
        }
        else{
            System.out.println("Insira valores válidos");
        }
        
        return saldo;
    }
    
    String tipoConta(){
        System.out.println("Conta Comum");
        return null;
    }
    
}
