package MeuAparelho;

public class MP3 {
	
	public int musicas;
	
	public int volume;
	
	public String cor;
	
	public String memoria;
	
	public int radio;

	public MP3(int musicas, int volume, String cor, String memoria, int radio) {
		super();
		this.musicas = musicas;
		this.volume = volume;
		this.cor = cor;
		this.memoria = memoria;
		this.radio = radio;
	}

	public int getMusicas() {
		return musicas;
	}

	public void setMusicas(int musicas) {
		this.musicas = musicas;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

}
