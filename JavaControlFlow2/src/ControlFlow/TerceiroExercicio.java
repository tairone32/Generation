package ControlFlow;
import java.util.*;
public class TerceiroExercicio {
	public static void main(String[] args) {
		
		int ma�a;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Entre com a quantia de ma��: ");
		ma�a=ler.nextInt();
		float total1,total2;
		
		if(ma�a<=12) {
			
		total1=(float) ((float)ma�a*0.30);
		System.out.printf("\nVoc� vai pagar o valor de: %.2f",total1);
		}
		else {
			total2=(float) ((float)ma�a*0.25);
			System.out.printf("\nVoc� vai pagar o valor de: %.2f",total2);
		}
	}

}
