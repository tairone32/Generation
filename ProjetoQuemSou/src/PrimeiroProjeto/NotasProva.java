package PrimeiroProjeto;

import java.util.*;

public class NotasProva {
	
	public static void main(String[] args) {
		
		double N1,N2,N3;
		
		String name;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Entre com o nome ");
		name = ler.next();
		ler.nextLine();
		
		System.out.printf("Entre com a primeira nota");
		N1 = ler.nextInt();
		
		System.out.printf("Entre com a segunda nota");
		N2 = ler.nextInt();
		
		System.out.printf("Entre com a terceira nota");
		N3 = ler.nextInt();
		
		double madiaTotal;
		
		madiaTotal = (2 * N1 + 3 * N2 + 5 * N3) / (2 + 3 + 5);
		
		System.out.printf("A media total do Aluno :"+ name + "com media: " + madiaTotal);

		
		
		
	}

}
