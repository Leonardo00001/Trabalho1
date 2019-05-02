/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samsung
 */
public class ContaPoupanca extends Contas {
    
    double reajustar (double taxa){
        saldo = saldo *taxa;
        return saldo;        
    }
    
    double reajustar (){
        saldo = saldo * 0.1;
        return saldo;        
    }
    
    String tipoConta (){
        System.out.println("Conta Poupança");
        return null;
    }
}
