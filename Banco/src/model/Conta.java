/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 13304611690
 */
public class Conta {

    double saldo;

  public double getSaldo() {
    return this.saldo;
  }

  public void deposita(double valor) {
    this.saldo += valor;
  }

  public void atualiza(double taxa) {
    this.saldo += this.saldo * taxa;
  }
    
    
}
