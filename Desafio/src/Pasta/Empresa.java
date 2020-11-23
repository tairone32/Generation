package Pasta;

public class Empresa {
	public static void main(String[] args) {
		
		Forn Fornecedor1 = new Forn("BancoGF", "R:onde judas perdeu as botas nº 1000", 32274635,3000,100);
		
		System.out.println("\nNome: "+Fornecedor1.nome);
		System.out.println("\nEndereço: "+Fornecedor1.endereço);
		System.out.println("\nTelefone: "+Fornecedor1.telefone);
		System.out.println("\nValor credito: "+Fornecedor1.valorCredito);
		System.out.println("\nValor divida: "+Fornecedor1.valorDivida);
	}

}
