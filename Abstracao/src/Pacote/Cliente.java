package Pacote;

public class Cliente {
	public String nome;
	
	public String sobreNome;
	
	public long telefone;
	
	public String email;
	
	public long cpf;

	public Cliente(String nome, String sobreNome, long telefone, String email, long cpf) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.telefone = telefone;
		this.email = email;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String getNomeCompleto() {
		String NomeCompleto = nome+" "+ sobreNome;
		
		return NomeCompleto;
	}
}

