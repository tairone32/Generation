package Pasta;

public class Vendedor extends Pessoa {
	public float valorVendas;
	
	public float salarioBase;

	public Vendedor(String nome, String endere�o, long telefone, float valorVendas, float salarioBase) {
		super(nome, endere�o, telefone);
		this.valorVendas = valorVendas;
		this.salarioBase = salarioBase;
	}

	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getcomissao() {
		float comissao= salarioBase/valorVendas;
		return comissao;
	}
}
