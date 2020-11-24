package Ex1;

public class Animals {
	private String nomes;
	
	private int Idade;
	
	public String emitirSom;

	public Animals(String nomes, int idade, String emitirSom) {
		super();
		this.nomes = nomes;
		Idade = idade;
		this.emitirSom = emitirSom;
	}

	public String getNomes() {
		return nomes;
	}

	public void setNomes(String nomes) {
		this.nomes = nomes;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

}
