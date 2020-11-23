package Pasta;

public class Forn extends Pessoa {
//Atributos//
	public int valorCredito;

	public int valorDivida;

	public Forn(String nome, String endereço, long telefone, int valorCredito, int valorDivida) {
		super(nome, endereço, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public int getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}

	public int getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}

	public int getObterSaldo() {
		int ObterSaldo = valorDivida - valorCredito;
		return ObterSaldo;
	}
}
