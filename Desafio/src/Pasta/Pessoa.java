package Pasta;

public class Pessoa {
//Atributos//
	public String nome;

	public String endere�o;

	public long telefone;
//*primeiro construtor*//
	public Pessoa(String nome, String endere�o, long telefone) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}
	//*segundo construtor*//
	public Pessoa() {

	}
	//*terceiro construtor*//
	public Pessoa(String nome, long telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	
	//Metodos//

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

}
