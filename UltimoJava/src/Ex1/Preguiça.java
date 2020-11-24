package Ex1;

public class Preguiça extends Animals{
	public String oqueFaz;

	public Preguiça(String nomes, int idade, String emitirSom) {
		super(nomes, idade, emitirSom);
		
	}

	public String getOqueFaz() {
		
		return oqueFaz;
	}

	public void setOqueFaz(String oqueFaz) {
		
		this.oqueFaz = oqueFaz;
	}
	
}
