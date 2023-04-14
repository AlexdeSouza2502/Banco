package view;

import model.*;

public class TesteDoGerenciadorDeImpostosDeRenda {
    public static void main(String[] args) {
        GerenciadorDeImpostosDeRenda gerenciador = new GerenciadorDeImpostosDeRenda();
        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adiciona(cc);

        System.out.println(gerenciador.getTotal());
        System.out.printf("O saldo é: %.2f" , cc.getSaldo());
    }
}
