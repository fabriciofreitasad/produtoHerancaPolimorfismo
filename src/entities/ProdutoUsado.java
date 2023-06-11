package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class ProdutoUsado extends Produto{
	private LocalDate dataFabrica��o;
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String name, Double preco, LocalDate dataFabrica��o) {
		super(name, preco);
		this.dataFabrica��o = dataFabrica��o;
	}

	public LocalDate getDataFabrica��o() {
		return dataFabrica��o;
	}

	public void setDataFabrica��o(LocalDate dataFabrica��o) {
		this.dataFabrica��o = dataFabrica��o;
	}
	@Override
	public String precoTag() {
		return getName() 
				+ " (usado) $ " 
				+ String.format("%.2f", getPreco())
				+ " (Data de fabrica��o: "
				+ dataFabrica��o.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";

}
}