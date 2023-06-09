package view;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

public class TesteDasConta{
    public static void main(String[] args) throws ValorInvalidoException {
    
    
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca cp = new ContaPoupanca();

    
    cc.deposita(1000);
        try {
            cp.deposita(1000);
        } catch (ValorInvalidoException ex) {
            Logger.getLogger(TesteDasConta.class.getName()).log(Level.SEVERE, null, ex);
        }

    AtualizadorDeContas adc = new AtualizadorDeContas(0.10);
    
    adc.roda(cc);
    adc.roda(cp);
    System.out.println("\nSaldo Total: " + adc.getSaldoTotal());
  }
}