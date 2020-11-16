package PrimeiroProjeto;

import java.util.*;
public class JoaoTomateiro {
	
	public static void main(String[] args) {
		
		int quantiaTomates, passouLimite = 0,valorMulta;
		Scanner ler = new Scanner (System.in);
		System.out.printf("Entre com a quantia de tomates em KG: ");
		quantiaTomates = ler.nextInt(); 
		
		if (quantiaTomates <= 50) {
			
			System.out.printf("\nO valor da sua vulta foi de: %d",passouLimite);
			valorMulta=4;
		}
		else if (quantiaTomates > 50 ) {
			passouLimite = (quantiaTomates - 50) *4;
			
			System.out.printf("\nvoce exedeu o limite de 50kG e vai pagar pela multa (4,00 $) por KG:");
			System.out.printf("\nValor Total: %d",passouLimite);
		}
	}

}
