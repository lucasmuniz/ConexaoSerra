package model;

import exceptions.FaltouDinheiroException;

public class Cliente {

    public double efetuarCompraComDinheiro(Compra compra, double dinheiro) throws FaltouDinheiroException {
        if (compra.getPagamento().possoPagarDinheiro(dinheiro)) {
            return compra.getPagamento().calcularTroco(dinheiro);
        }
        throw new FaltouDinheiroException();
    }

    public boolean efetuarCompraComCartao(Compra compra) {
        return compra.getPagamento().possoPagarCartao();
    }
}
