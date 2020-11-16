package PrimeiroProjeto;

import java.util.*;
import java.math.*;

public class NumeroQuadrado {

	public static void main(String[] args) {
		
		float N1, N2, N3, N4;

		Scanner ler = new Scanner(System.in);
		System.out.printf("\nEntre com o P1: ");
		N1 = ler.nextFloat();
		
		System.out.printf("\nEntre com o P2: ");
		N2 = ler.nextFloat();
		
		System.out.printf("\nEntre com o P3: ");
		N3 = ler.nextFloat();
		
		System.out.printf("\nEntre com o P4: ");
		N4 = ler.nextFloat();
		
		float respN1,respN2,respN3,respN4;
		
		respN1 = N1*N1;
		respN2 = N2*N2;
		respN3 = N3*N3;
		respN4 = N4*N4;
		
		if (respN3>1000) {
			System.out.println("\nO valor resultante do quadrado de P3 foi maior que 1000");
			System.out.printf("\nP3: %.2f",respN3);
		}
		
		else {
			
			System.out.printf("\nP1: %.2f",respN1);
			System.out.printf("\nP2: %.2f",respN2);
			System.out.printf("\nP3: %.2f",respN3);
			System.out.printf("\nP4: %.2f",respN4);
		}

	}
}
