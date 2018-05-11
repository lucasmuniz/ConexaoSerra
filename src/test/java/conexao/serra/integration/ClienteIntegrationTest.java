package conexao.serra.integration;

import exceptions.FaltouDinheiroException;
import model.Cliente;
import model.Compra;
import model.Produto;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ClienteIntegrationTest {

    protected Cliente cliente;

    @BeforeMethod
    public void antesMetodo(){
        this.cliente = new Cliente();
    }

    @Test
    public void Deveria_Efetuar_Compra_Com_Dinheiro_Com_Sucesso() throws FaltouDinheiroException {
        //scenery
        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Produto 1", 4, 1));
        Compra compra = new Compra(produtos);

        //action
        double troco = cliente.efetuarCompraComDinheiro(compra, 5);

        //assert
        Assert.assertTrue(troco == 1);
    }

    @Test(expectedExceptions = FaltouDinheiroException.class)
    public void Nao_Deveria_Efetuar_Compra_Sem_Dinheiro_Suficiente() throws FaltouDinheiroException {
        //scenery
        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Produto 1", 4, 1));
        Compra compra = new Compra(produtos);

        //action
        cliente.efetuarCompraComDinheiro(compra, 3);
    }

    @Test
    public void Deveria_Efetuar_Compra_Com_Cartao_Com_Sucesso() {
        //scenery
        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Produto 1", 4, 1));
        Compra compra = new Compra(produtos);

        //action
        boolean compraAprovada = cliente.efetuarCompraComCartao(compra);

        //assert
        Assert.assertTrue(compraAprovada);
    }

    /**Realizar 'teste' com cartão sem limite**/
}
