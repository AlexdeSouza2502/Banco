package view;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.CRC32;

import model.*;

public class TesteDosTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        try {
            cc.deposita(1000);
        } catch (ValorInvalidoException ex) {
            Logger.getLogger(TesteDosTributavel.class.getName()).log(Level.SEVERE, null, ex);
        }
        cc.calculaTributos();
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
        


    }
}
