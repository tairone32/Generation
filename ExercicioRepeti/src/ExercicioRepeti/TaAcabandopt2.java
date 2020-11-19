package ExercicioRepeti;
import java.util.*;
public class TaAcabandopt2 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		float num,resp = 0;
		System.out.println("Digite um numero valido");
		num=ler.nextFloat();
		
		if(num<0) {
			System.out.println("Digite um numero valido");
		}
		else
		
			while(num>0 && resp<=100) {
				resp=num*3;
				System.out.println("\nValor: "+resp);
				break;
			}
		}
	}


