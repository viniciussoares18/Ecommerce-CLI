package org.example;

public abstract class Produto implements Vendavel {
    private String nome;
    private int codigo;
    private double precoCusto;

    public Produto(String nome, int codigo, double precoCusto) {
        this.nome = nome;
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    protected double getPrecoCusto() {
        return precoCusto;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nCodigo: " + codigo +
                "\nPreco de Custo: R$" + precoCusto;
    }
}
