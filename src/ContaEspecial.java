/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samsung
 */
public class ContaEspecial extends ContaPoupanca{
   
    int limite = 1000;
    
    void descontar (double multa){
        
        if (saldo+limite >=saque){
            saldo = ((saldo-saque)*(multa/100))+(saldo-saque);
        }
        else{
            System.out.println("A quantia solicitada não pode ser sacada");
        }  
    }
    
    String tipoConta (){
        System.out.println("Conta Especial");
        return null;
    }
    
}
