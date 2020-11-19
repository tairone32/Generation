package ExercicioRepeti;
import java.util.*;
public class TaAcabando {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int numeros=0,multiplica=0,multiplica2,multiplica3,multiplica4,multiplica5,multiplica6;
		
		while(numeros>=0)
			
			if(numeros>=0) {
				System.out.println("\nEntre com um numero: ");
				numeros=ler.nextInt();
				System.out.println("\nVoce digitou: "+numeros);
				multiplica=numeros*3;
				System.out.println("\nValor: "+multiplica);
				multiplica2=multiplica*3;
				System.out.println("\nValor: "+multiplica2);
				multiplica3=multiplica2*3;
				System.out.println("\nValor: "+multiplica3);
			}
		if(numeros<4) {

			System.out.println("\nValor: "+multiplica);
			multiplica2=multiplica*3;
			System.out.println("\nValor: "+multiplica2);
			multiplica3=multiplica2*3;
			System.out.println("\nValor: "+multiplica3);
			multiplica4=multiplica3*3;
			System.out.println("\nValor: "+multiplica4);
		}
	}

}
