package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

public class TesteDoGerenciadorDeImpostosDeRenda {
    public static void main(String[] args) {
        GerenciadorDeImpostosDeRenda gerenciador = new GerenciadorDeImpostosDeRenda();
        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);
        ContaCorrente cc = new ContaCorrente();
        try {
            cc.deposita(1000);
        } catch (ValorInvalidoException ex) {
            Logger.getLogger(TesteDoGerenciadorDeImpostosDeRenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        gerenciador.adiciona(cc);

        System.out.println(gerenciador.getTotal());
        System.out.printf("O saldo é: %.2f" , cc.getSaldo());
    }
}
