package Pasta;

public class Empregado extends Pessoa {
	
	public int codSetor;
	
	public float salarioBase;
	
	public float imposto;

	public Empregado(String nome, String endereço, long telefone, int codSetor, float salarioBase, float imposto) {
		super(nome, endereço, telefone);
		this.codSetor = codSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodSetor() {
		return codSetor;
	}

	public void setCodSetor(int codSetor) {
		this.codSetor = codSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	public float getcalcularSalario() {
		float calcularSalario = salarioBase+imposto;
		return calcularSalario;
	}
}
