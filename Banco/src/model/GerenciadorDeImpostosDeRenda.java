package model;

public class GerenciadorDeImpostosDeRenda {
    private double total;

    public void adiciona (Tributavel trib) {
        System.out.println("Adicionando taxa tributária: " + trib);
        this.total += trib.calculaTributos();
    }

    public double getTotal () {
        return this.total;

    }
    
}
