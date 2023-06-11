package entities;

public class ProdutoImportado extends Produto {
	private Double taxaAfandega;

	public ProdutoImportado(String name, Double preco, Double taxaAfandega) {
		super(name, preco);
		this.taxaAfandega = taxaAfandega;
	}

	public Double getAfandega() {
		return taxaAfandega;
	}

	public void setAfandega(Double afandega) {
		this.taxaAfandega = afandega;
	}
	
	public Double totalPreco() {
		return getPreco() + taxaAfandega;
	}
	
	@Override
	public String precoTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPreco())
				+ " (Taxa Alfândega: $ " 
				+ String.format("%.2f", taxaAfandega)
				+ ")";
	}
	

}

