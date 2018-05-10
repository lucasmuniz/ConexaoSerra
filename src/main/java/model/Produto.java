package model;

public class Produto {

    private String nome;
    private double preco;
    private double quantidade;

    public Produto(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularPrecoTotalProduto() {
        return preco * quantidade;
    }

}
