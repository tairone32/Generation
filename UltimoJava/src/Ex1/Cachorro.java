package Ex1;

public class Cachorro extends Animals{
	
	public String oqueFaz;

	public Cachorro(String nomes, int idade, String emitirSom, String oqueFaz) {
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
