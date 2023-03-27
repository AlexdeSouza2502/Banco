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
public class ContaPoupanca extends Conta {
     public void atualiza(double taxa) {
    super.deposita(getSaldo() * taxa * 3);
  }
}
