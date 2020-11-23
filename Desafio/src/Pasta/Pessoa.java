package Pasta;

public class Pessoa {
//Atributos//
	public String nome;

	public String enderešo;

	public long telefone;
//*primeiro construtor*//
	public Pessoa(String nome, String enderešo, long telefone) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

}
