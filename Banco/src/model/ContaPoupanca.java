package model;

public class ContaPoupanca extends Conta {
    public void atualiza(double taxa) throws ValorInvalidoException {
      super.deposita(this.getSaldo() * taxa * 3);
    }
  }
