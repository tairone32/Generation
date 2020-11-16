package PrimeiroProjeto;

import java.util.*;

public class ParImpar {
	public static void main(String[] args) {
		
		System.out.println("Aqui vamos diferenciar os numeros par e impar!");
		
		int valor,valorMod;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Digite um valor: ");
		valor = ler.nextInt();
		
		
		if (valor%2 == 0 ){	
			System.out.println("\nEsse numero é par!");
		}
			else {
			System.out.println("\nEsse numero é impar!");
			}
			
		}
		
	}
