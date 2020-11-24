package MinhaLoja;

public class SmartPhone extends Produto {
		
	private String marca;
	private  int memoria;
	private int camera;
	public SmartPhone(String name, float preco, String codProduto, String marca, int memoria, int camera) {
		super(name, preco, codProduto);
		this.marca = marca;
		this.memoria = memoria;
		this.camera = camera;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public int getCamera() {
		return camera;
	}
	public void setCamera(int camera) {
		this.camera = camera;
	}
	
	
	
}
