package org.example;

public class Livro extends Produto {
    private String autor;
    private String isbn;

    public Livro(String nome, int codigo, double precoCusto, String autor, String isbn) {
        super(nome, codigo, precoCusto);
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "\n\nLivro {" +
                super.toString() +
                "\nAutor: " + autor +
                "\nISBN: " + isbn +
                "}\n";
    }

    @Override
    public double getValorVenda() {
        return super.getPrecoCusto() * 1.1;
    }

}
