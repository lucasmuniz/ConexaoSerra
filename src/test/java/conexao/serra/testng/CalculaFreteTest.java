package conexao.serra.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import constant.TaxaFreteEstado;
import exceptions.TaxaUFNaoEncontradaException;
import model.CalculaFrete;

public class CalculaFreteTest {
	
	private CalculaFrete calculaFrete;

	@Test
	public void calcular_valor_da_taxa_do_frete_para_cep_de_SC() {
		try {
			TaxaFreteEstado taxa = calculaFrete.taxaDeFretePorEstado(88511030);
			Assert.assertEquals(taxa.getValorTaxa(), 10.0);
		} catch (TaxaUFNaoEncontradaException e) {
			Assert.fail(e.getMessage());
		}
	}
	
	@BeforeMethod
	public void executarAntesDometodo() {
		calculaFrete = new CalculaFrete();
	}
	
	@Test
	public void calcular_valor_da_taxa_do_frete_para_cep_de_RS() {
		try {
			TaxaFreteEstado taxa = calculaFrete.taxaDeFretePorEstado(90000001);
			Assert.assertEquals(taxa.getValorTaxa(), 20.0);
		} catch (TaxaUFNaoEncontradaException e) {
			Assert.fail(e.getMessage());
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test(expectedExceptions = TaxaUFNaoEncontradaException.class)
	public void calcular_valor_da_taxa_do_frete_para_cep_fora_da_cobertura() throws TaxaUFNaoEncontradaException {
		CalculaFrete calculaFrete = new CalculaFrete();
		calculaFrete.taxaDeFretePorEstado(999999991);
	}
	
	@Test(expectedExceptions = TaxaUFNaoEncontradaException.class)
	public void calcular_valor_da_taxa_do_frete_para_cep_menor_fora_da_cobertura() throws TaxaUFNaoEncontradaException {
		CalculaFrete calculaFrete = new CalculaFrete();
		calculaFrete.taxaDeFretePorEstado(70000000);
	}
	

}
