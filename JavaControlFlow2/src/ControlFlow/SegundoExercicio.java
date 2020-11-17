package ControlFlow;
import java.util.*;
public class SegundoExercicio {
	public static void main(String[] args) {
		
		int senha;
		Scanner ler =new Scanner(System.in);
		System.out.print("Entre com sua senha: ");
		senha=ler.nextInt();
		
		if(senha != 1234) {
			System.out.println("\nACESSO NEGADO");
		}
		else {
			System.out.println("\nACESSO PERMITIDO");
		}
		
	}

}
