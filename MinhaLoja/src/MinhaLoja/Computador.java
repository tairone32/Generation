package MinhaLoja;

public class Computador extends Produto {
	
	private String placaDeVideo, marca;
	
	private int memoria;
	
	private int hd;
	
	public Computador(String name, float preco, String codProduto, String placaDeVideo, int memoria, int hd, String marca) {
		super(name, preco, codProduto);
		this.placaDeVideo = placaDeVideo;
		this.memoria = memoria;
		this.hd = hd;
		this.marca = marca;
	}
	
	public String getPlacaDeVideo() {
		return placaDeVideo;
	}
	public void setPlacaDeVideo(String placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}
	public String getMemoria() {
		return memoria+"gb";
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public String getHd() {
		return hd+"gb";
	}
	public void setHd(int hd) {
		this.hd = hd;
	}
	
}
