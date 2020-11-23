package Pasta;

public class Pessoa {
//Atributos//
	public String nome;

	public String endereço;

	public long telefone;
//*primeiro construtor*//
	public Pessoa(String nome, String endereço, long telefone) {
		super();
		this.nome = nome;
		this.endereço = endereço;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

}
