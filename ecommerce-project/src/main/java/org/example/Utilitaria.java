package org.example;

import java.util.Scanner;

public class Utilitaria {
    private static Scanner inputString = new Scanner(System.in);
    private static Scanner inputDouble = new Scanner(System.in);
    private static Scanner inputInt = new Scanner(System.in);

    private static Carrinho carrinho = new Carrinho();

    public static void exibirMenu(){
        System.out.println( "|QUAL AÇÃO DESEJA REALIZAR?|\n");
        System.out.println( "| 1 - Adicionar Livro ao Carrinho\n" +
                            "| 2 - Adicionar DVD ao Carrinho\n" +
                            "| 3 - Adicionar Servico ao Carrinho\n" +
                            "| 4 - Exibir Itens do Carrinho\n" +
                            "| 5 - Exibir Total de Venda\n" +
                            "| 6 - Fim");
        Integer result = inputInt.nextInt();
        verificadorDeResposta(result);
    }

    private static void verificadorDeResposta(Integer result){
        if(result > 6 || result < 1){
            System.out.println("Número Inválido");
            exibirMenu();
        }
        else {
            redirecionador(result);
        }
    }

    private static Livro adicionaLivro(){
        System.out.println("Digite o Nome do Livro:");
        String nome = inputString.nextLine();
        System.out.println("Digite o Codigo do Livro:");
        int codigo = inputInt.nextInt();
        System.out.println("Digite o Preco de Custo do Livro:");
        double precoCusto = inputDouble.nextDouble();
        System.out.println("Digite o Autor do Livro:");
        String autor = inputString.nextLine();
        System.out.println("Digite o ISBN (International Standard Book Number) do Livro:");
        String isbn = inputString.nextLine();
        return new Livro(nome, codigo, precoCusto, autor, isbn);
    }

    private static Dvd adicionaDvd(){
        System.out.println("Digite o Nome do Dvd:");
        String nome = inputString.nextLine();
        System.out.println("Digite o Codigo do Dvd:");
        int codigo = inputInt.nextInt();
        System.out.println("Digite o Preco de Custo do Dvd:");
        double precoCusto = inputDouble.nextDouble();
        System.out.println("Digite a Gravadora do Dvd:");
        String gravadora = inputString.nextLine();
        return new Dvd(nome, codigo, precoCusto,gravadora);
    }

    private static Servico adicionaServico(){
        System.out.println("Digite a Descricao do Servico:");
        String descricao = inputString.nextLine();
        System.out.println("Digite o Codigo do Servico:");
        int codigo = inputInt.nextInt();
        System.out.println("Digite o Valor da Hora do Servico:");
        double valorHora = inputDouble.nextDouble();
        System.out.println("Digite a Quantidade de Horas do Servico:");
        int quantHoras = inputInt.nextInt();

        return new Servico(descricao, codigo, quantHoras, valorHora);
    }

    private static void redirecionador(int result){
        switch (result){
            case 1 : {
                carrinho.adicionaVendavel(adicionaLivro());
                System.out.println("\nLivro Adicionado com Sucesso!\n");
                break;
            }
            case 2 : {
                carrinho.adicionaVendavel(adicionaDvd());
                System.out.println("\nDvd Adicionado com Sucesso!\n");
                break;
            }
            case 3 : {
                carrinho.adicionaVendavel(adicionaServico());
                System.out.println("\nServico Adicionado com Sucesso!\n");
                break;
            }
            case 4 : {
                System.out.println("\nExibindo Total de Itens do Carrinho:");
                carrinho.exibeItensCarrinho();
                break;
            }
            case 5 : {
                System.out.println("\nExibindo Total de Venda:");
                System.out.println(carrinho.calculaTotalVenda() + "\n");
                break;
            }
            case 6 : {
                System.out.println("Até logo! :)");
                System.exit(0);
            }
        }
        exibirMenu();
    }

}
