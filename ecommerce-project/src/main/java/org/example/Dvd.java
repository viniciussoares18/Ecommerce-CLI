package org.example;

public class Dvd extends Produto{
    private String gravadora;

    public Dvd(String nome, int codigo, double precoCusto, String gravadora) {
        super(nome, codigo, precoCusto);
        this.gravadora = gravadora;
    }

    @Override
    public double getValorVenda() {
        return super.getPrecoCusto() * 1.2;
    }

    @Override
    public String toString() {
        return "\n\nDVD {" +
                super.toString() +
                "\nGravadora: " + gravadora +
                "}\n";
    }
}
