package PrimeiroProjeto;

import java.util.*;

public class ValorCarro {

	public static void main(String[] args) {
		
		double valor;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("entre com o valor ");
		valor = ler.nextDouble();
		
		double valorImposto = 1.73;
		double valorTotal = valor * valorImposto;
		
		System.out.printf("O valor total do carro seria "+ valorTotal);
		
		
		
	}
	
}
