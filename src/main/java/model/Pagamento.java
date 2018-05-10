package model;

import service.ConsultarLimiteService;

import java.util.List;

public class Pagamento {

    private ConsultarLimiteService consultarLimiteService;
    private List<Produto> produtos;

    public Pagamento(List<Produto> produtos) {
        this.consultarLimiteService = new ConsultarLimiteService();
        this.produtos = produtos;
    }

    public boolean possoPagarDinheiro(double dinheiro) {
        return dinheiro >= calcularPrecoTotalDosProdutos();
    }

    public boolean possoPagarCartao() {
        double valorCompra = calcularPrecoTotalDosProdutos();
        return this.consultarLimiteService.compraAprovada(valorCompra);
    }

    public double calcularTroco(double dinheiro) {
        return dinheiro - calcularPrecoTotalDosProdutos();
    }

    private double calcularPrecoTotalDosProdutos() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.calcularPrecoTotalProduto();
        }
        return total;
    }
}
