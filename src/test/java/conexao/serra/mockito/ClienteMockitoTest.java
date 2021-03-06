package conexao.serra.mockito;

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

public class ClienteMockitoTest {

    @Mock
    protected Cliente cliente;

    @BeforeMethod
    public void antesMetodo(){
        MockitoAnnotations.initMocks(this);
    }

    /**Efetuar compra com sucesso**/
    @Test
    public void Deveria_Efetuar_Compra_Com_Dinheiro_Com_Sucesso() throws FaltouDinheiroException {
        //scenery
        Mockito.when(cliente.efetuarCompraComDinheiro(Mockito.any(Compra.class), Mockito.anyDouble())).thenCallRealMethod();
        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Produto 1", 4, 1));
        Compra compra = new Compra(produtos);

        //action
        double troco = cliente.efetuarCompraComDinheiro(compra, 5);

        //assert
        Assert.assertTrue(troco == 1);
    }

    /**Realizar teste com mock Exception**/


    /**Realizar teste com mock Sem Limite**/



















     /*@Test (expectedExceptions = FaltouDinheiroException.class)
    public void DeveriaRetornarException() throws FaltouDinheiroException {
        //scenery
        Mockito.when(cliente.efetuarCompraComDinheiro(Mockito.any(Compra.class), Mockito.anyDouble())).thenThrow(new FaltouDinheiroException());
        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Produto 1", 4, 1));
        Compra compra = new Compra(produtos);

        //action
        cliente.efetuarCompraComDinheiro(compra, 5);
    }*/


   /* @Test
    public void NaoDeveriaEfetuarCompraComCartaoSemLimite() {
        //scenery
        Mockito.when(cliente.efetuarCompraComCartao(Mockito.any(Compra.class))).thenReturn(false);
        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Produto 1", 4, 1));
        Compra compra = new Compra(produtos);

        //action
        boolean compraAprovada = cliente.efetuarCompraComCartao(compra);

        //assert
        Assert.assertFalse(compraAprovada);
    }*/
}
