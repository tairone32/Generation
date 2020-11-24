package MinhaLoja;

public class Televisor extends Produto {
	
	public String marca;
	
	public int polegadas;
	
	public boolean smart;

	public Televisor(String name, float preco, String codProduto, String marca, int polegadas, boolean smart) {
		super(name, preco, codProduto);
		this.marca = marca;
		this.polegadas = polegadas;
		this.smart = smart;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

}
