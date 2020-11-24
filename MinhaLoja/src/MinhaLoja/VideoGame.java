package MinhaLoja;

public class VideoGame {

	private String name;
	
	private float preco;
	
	private String codProduto;
	
	private String HDR;
	
	public VideoGame(String name, float preco, String codProduto, String HDR) {
	this.name = name;
	this.preco = preco;
	this.codProduto = codProduto;
	this.HDR = HDR;
	
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

	public String getHDR() {
		return HDR;
	}

	public void setHDR(String HDR) {
		this.HDR =  HDR;
	}
}
