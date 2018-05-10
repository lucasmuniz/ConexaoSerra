package model;

import java.util.List;

public class Compra {

    private List<Produto> produtos;
    private Pagamento pagamento;

    public Compra(List<Produto> produtos) {
        this.produtos = produtos;
        this.pagamento = new Pagamento(produtos);
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

}
