package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Vendavel> vendaveis;

    public Carrinho() {
        this.vendaveis = new ArrayList<>();
    }

    public void adicionaVendavel(Vendavel vendavel){
        this.vendaveis.add(vendavel);
    }

    public void exibeItensCarrinho(){
        for (Vendavel vendavel : vendaveis){
            System.out.println(vendavel);
        }
    }

    public double calculaTotalVenda(){
        double totalVenda = 0.0;
        for(Vendavel vendavel : this.vendaveis){
            totalVenda += vendavel.getValorVenda();
        }
        return totalVenda;
    }
}
