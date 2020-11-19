package ExercicioRepeti;

import java.util.*;

public class OitavoExercicio {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numeros=0,somaNumeros=0,mediaNumeros,valoresLidos=0;

		while(numeros>=0) {
			System.out.print("\nEntre com o valor: ");
			numeros=ler.nextInt();
			if (numeros>=0) {
				somaNumeros=numeros+somaNumeros;
				valoresLidos++;
			}
		}
		mediaNumeros= somaNumeros/valoresLidos;
		System.out.println("\n soma de numeros foi: "+somaNumeros);{
		System.out.println("\n Foi: "+valoresLidos+" numeros atribuidos");
		System.out.println("\n E o valor da media foi: "+mediaNumeros);
		}
	}
}

