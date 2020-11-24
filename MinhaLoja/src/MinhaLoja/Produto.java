package MinhaLoja;

public class Produto {
	private String name;
	
	private float preco;
	
	private String codProduto;

	public Produto(String name, float preco, String codProduto) {
		super();
		this.name = name;
		this.preco = preco;
		this.codProduto = codProduto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}
	

}
