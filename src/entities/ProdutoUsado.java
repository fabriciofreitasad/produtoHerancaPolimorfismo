package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ProdutoUsado extends Produto{
	private LocalDate dataFabricação;
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String name, Double preco, LocalDate dataFabricação) {
		super(name, preco);
		this.dataFabricação = dataFabricação;
	}

	public LocalDate getDataFabricação() {
		return dataFabricação;
	}

	public void setDataFabricação(LocalDate dataFabricação) {
		this.dataFabricação = dataFabricação;
	}
	@Override
	public String precoTag() {
		return getName() 
				+ " (usado) $ " 
				+ String.format("%.2f", getPreco())
				+ " (Data de fabricação: "
				+ dataFabricação.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";

}
}