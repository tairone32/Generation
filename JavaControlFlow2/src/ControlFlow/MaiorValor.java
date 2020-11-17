package ControlFlow;

import java.util.*;

public class MaiorValor {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		float p1, p2, p3;

		System.out.println("Entre com o primeiro numero: ");
		p1 = ler.nextFloat();

		System.out.println("Entre com o segundo numero: ");
		p2 = ler.nextFloat();

		System.out.println("Entre com o terceiro numero: ");
		p3 = ler.nextFloat();

		if (p1 > p2 && p2 > p3) {

			System.out.printf("\nMaior Numero: %.2f", p1);
		}
		if (p2 > p3 && p3 > p1) {

			System.out.printf("\nMaior Numero: %.2f", p2);
		}
		else if (p3 > p2 && p2 > p1) {

			System.out.printf("\nMaior Numero: %.2f", p3);
		}
	}
}
