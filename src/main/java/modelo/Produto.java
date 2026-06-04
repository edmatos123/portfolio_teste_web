package modelo;

public class Produto {

	private String descproduto;
	private String valorProduto;
	private int qtdProduto;
	
	
	public Produto descProduto(String descproduto) {
		this.descproduto = descproduto;
		return this;
	}
	
	public Produto valorProduto(String valorProduto) {
		this.valorProduto = valorProduto;
		return this;
	}
	
	public Produto qtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
		return this;
	}

	public String getDescproduto() {
		return descproduto;
	}

	public void setDescproduto(String descproduto) {
		this.descproduto = descproduto;
	}

	public String getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(String valorProduto) {
		this.valorProduto = valorProduto;
	}

	public int getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	
	
	
	
	
}
