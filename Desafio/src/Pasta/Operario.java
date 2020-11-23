package Pasta;

public class Operario extends Pessoa {
	
	public float valorProdu�ao;
	public float salarioBase;

	public Operario(String nome, String endere�o, long telefone,float salarioBase,float valorProdu�ao) {
		super(nome, endere�o, telefone);
		this.valorProdu�ao = valorProdu�ao;
	}

	public float getValorProdu�ao() {
		return valorProdu�ao;
	}

	public void setValorProdu�ao(float valorProdu�ao) {
		this.valorProdu�ao = valorProdu�ao;
	}

	public float getcomissao() {
		float comissao = (valorProdu�ao/salarioBase);
		return comissao;
	}
}
