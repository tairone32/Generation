package ExercicioRepeti;
import java.util.*;
public class SetimoExercicio {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int contador,somaImpar = 0;
		
		for(contador=0;contador<=500;contador++) {
			
				
			if(contador%2==1 && contador%3==0) {
				somaImpar=contador++;
			}
			
		}
		System.out.println("\n A soma dos numeros impares multiplo de 3 é: "+somaImpar);
	}

}
