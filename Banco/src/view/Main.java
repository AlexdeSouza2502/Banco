/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

/**
 *
 * @author 13304611690
 */
public class Main {
    public static void main(String[] args) {
    Conta c = new Conta();
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca cp = new ContaPoupanca();
    
    c.deposita(1000);
    cc.deposita(1000);
    cp.deposita(1000);
    
    c.atualiza(0.10);
    cc.atualiza(0.10);
    cp.atualiza(0.10);
    
    System.out.println("Saldo da conta: " + c.getSaldo());
    System.out.println("Saldo da conta corrente: " + cc.getSaldo());
    System.out.println("Saldo da conta poupança: " + cp.getSaldo());
}
}