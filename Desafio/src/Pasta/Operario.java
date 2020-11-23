package Pasta;

public class Operario extends Pessoa {
	
	public float valorProdušao;
	public float salarioBase;

	public Operario(String nome, String enderešo, long telefone,float salarioBase,float valorProdušao) {
		super(nome, enderešo, telefone);
		this.valorProdušao = valorProdušao;
	}

	public float getValorProdušao() {
		return valorProdušao;
	}

	public void setValorProdušao(float valorProdušao) {
		this.valorProdušao = valorProdušao;
	}

	public float getcomissao() {
		float comissao = (valorProdušao/salarioBase);
		return comissao;
	}
}
