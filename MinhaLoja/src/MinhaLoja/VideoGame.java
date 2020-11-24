package MinhaLoja;

public class VideoGame extends Produto {
	private String HDR;

	public VideoGame(String name, float preco, String codProduto, String hDR) {
		super(name, preco, codProduto);
		HDR = hDR;
	}

	public String getHDR() {
		return HDR;
	}

	public void setHDR(String hDR) {
		HDR = hDR;
	}

	
}
