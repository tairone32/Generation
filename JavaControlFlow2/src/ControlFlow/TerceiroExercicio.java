package ControlFlow;
import java.util.*;
public class TerceiroExercicio {
	public static void main(String[] args) {
		
		int maça;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Entre com a quantia de maçã: ");
		maça=ler.nextInt();
		float total1,total2;
		
		if(maça<=12) {
			
		total1=(float) ((float)maça*0.30);
		System.out.printf("\nVocê vai pagar o valor de: %.2f",total1);
		}
		else {
			total2=(float) ((float)maça*0.25);
			System.out.printf("\nVocê vai pagar o valor de: %.2f",total2);
		}
	}

}
