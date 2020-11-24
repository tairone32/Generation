package Ex1;

public class Cavalo extends Animals {
	public String oqueFaz;

	public Cavalo(String nomes, int idade, String emitirSom, String oqueFaz) {
		super(nomes, idade, emitirSom);
		this.oqueFaz = oqueFaz;
	}

	public String getOqueFaz() {
		
		return oqueFaz;
	}

	public void setOqueFaz(String oqueFaz) {
		this.oqueFaz = oqueFaz;
	}
	
}
