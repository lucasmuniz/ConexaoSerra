package model;

import java.util.List;

public class Compra {

    private List<Produto> produtos;

    public Compra() {
    }

    public Compra(List<Produto> produtos) {
        this.produtos = produtos;
    }

    private double calcularPrecoTotalDosProdutos() {
        double total = 0;
        for (Produto produto : this.produtos) {
            total += produto.calcularPrecoTotalProduto();
        }
        return total;
    }

    public boolean possoPagar(double dinheiro) {
        return dinheiro >= calcularPrecoTotalDosProdutos();
    }

    public double calcularTroco(double dinheiro) {
        return calcularPrecoTotalDosProdutos() - dinheiro;
    }
}
