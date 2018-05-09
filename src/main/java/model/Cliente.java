package model;

import exceptions.FaltouDinheiroException;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public List<Compra> comprasEfetuadas;

    public Cliente() {
        this.comprasEfetuadas = new ArrayList<Compra>();
    }

    public double efetuarCompra(Compra compra, double dinheiro) throws FaltouDinheiroException {
        if (compra.possoPagar(dinheiro)) {
            comprasEfetuadas.add(compra);
            return compra.calcularTroco(dinheiro);
        }
        throw new FaltouDinheiroException();
    }
}
