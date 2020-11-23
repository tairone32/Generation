package Pasta;

public class Operario extends Pessoa {
	
	public float valorProduçao;
	public float salarioBase;

	public Operario(String nome, String endereço, long telefone,float salarioBase,float valorProduçao) {
		super(nome, endereço, telefone);
		this.valorProduçao = valorProduçao;
	}

	public float getValorProduçao() {
		return valorProduçao;
	}

	public void setValorProduçao(float valorProduçao) {
		this.valorProduçao = valorProduçao;
	}

	public float getcomissao() {
		float comissao = (valorProduçao/salarioBase);
		return comissao;
	}
}
