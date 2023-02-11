package org.example;

public class Servico implements Vendavel {
    private String descricao;
    private int codigo;
    private int quantHoras;
    private double valorHora;

    public Servico(String descricao, int codigo, int quantHoras, double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.quantHoras = quantHoras;
        this.valorHora = valorHora;
    }

    @Override
    public double getValorVenda() {
        return quantHoras * valorHora;
    }

    @Override
    public String toString() {
        return "\n\nServico {" +
                "\nDescricao: " + descricao +
                "\nCodigo: " + codigo +
                "\nQuantidade de Horas: " + quantHoras + "Hrs" +
                "\nValor da Hora: R$" + valorHora +
                "}\n";
    }
}
