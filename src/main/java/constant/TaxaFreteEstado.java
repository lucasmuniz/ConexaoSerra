package constant;

public enum TaxaFreteEstado {

	TAXA_DO_FRETE_PARA_RS("RS", 20.00),
	TAXA_DO_FRETE_PARA_SC("SC", 10.00);

	private final String uf;

	private final double valorTaxa;

	TaxaFreteEstado(String uf, double valorTaxa) {
		this.uf = uf;
		this.valorTaxa = valorTaxa;
	}

	public String getUf() {
		return uf;
	}

	public double getValorTaxa() {
		return valorTaxa;
	}

}
