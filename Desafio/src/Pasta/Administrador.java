package Pasta;

public class Administrador extends Pessoa {
	public float ajudaCustos;

	public Administrador(String nome, String endere�o, long telefone, float ajudaCustos) {
		super(nome, endere�o, telefone);
		this.ajudaCustos = ajudaCustos;
	}

	public float getAjudaCustos() {
		return ajudaCustos;
	}

	public void setAjudaCustos(float ajudaCustos) {
		this.ajudaCustos = ajudaCustos;
	}
	
	
}
