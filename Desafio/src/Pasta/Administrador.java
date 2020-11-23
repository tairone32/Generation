package Pasta;

public class Administrador extends Pessoa {
	public float ajudaCustos;

	public Administrador(String nome, String endereço, long telefone, float ajudaCustos) {
		super(nome, endereço, telefone);
		this.ajudaCustos = ajudaCustos;
	}

	public float getAjudaCustos() {
		return ajudaCustos;
	}

	public void setAjudaCustos(float ajudaCustos) {
		this.ajudaCustos = ajudaCustos;
	}
	
	
}
