package ControlFlow;
import java.util.*;
public class PrimeiroExercicio {
	public static void main(String[] args) {
		
		float P1,P2;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Entre com o primeiro valor: ");
		P1=ler.nextFloat();
		
		System.out.printf("Entre com o segundo valor: ");
		P2=ler.nextFloat();
		
		
		if(P1>P2) {
			
			System.out.println("\nO primeiro valor é maior que o segundo!");
		}
		
		else {
			System.out.println("\nO segundo valor é maior que o primeiro!");
		}
			
		
	}

}
