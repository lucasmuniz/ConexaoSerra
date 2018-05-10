package model;

import constant.TaxaFreteEstado;
import exceptions.TaxaUFNaoEncontradaException;

public class CalculaFrete {
	
	public TaxaFreteEstado taxaDeFretePorEstado(int cep) throws TaxaUFNaoEncontradaException {
		if(cep >= 88000000 && cep <= 89999999) {
			return TaxaFreteEstado.TAXA_DO_FRETE_PARA_SC;
		}
		if(cep >= 90000000 && cep <= 99999999) {
			return TaxaFreteEstado.TAXA_DO_FRETE_PARA_RS;
		}
		throw new TaxaUFNaoEncontradaException("Taxa de frete não encontrada para o CEP informado.");
	}

}
