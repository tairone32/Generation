package PrimeiroProjeto;

import java.util.*;

public class HorasTrabalhadas {

	public static void main(String[] args) {
		String name;
		float horasTrabalhadas,semHora,comHora,total;
		
		Scanner ler = new Scanner (System.in);
		System.out.printf("\nEntre com a quantia de horas trabalhadas: ");
		horasTrabalhadas = ler.nextFloat();
		
		System.out.printf("\nEntre com seu nome: ");
		name = ler.next();
		
		
		
		if (horasTrabalhadas<=50) {
			
			semHora = horasTrabalhadas * 10;
			System.out.printf("\nColaborador: %s",name);
			System.out.printf("\nRrecebeu o valor total de: %f",semHora);
		}
		
		else if (horasTrabalhadas >50) {
			
			comHora = (horasTrabalhadas - 50)*20;
			total = comHora + 500;
			System.out.printf("\nColaborador: %s",name);
			System.out.printf("\nReecebeu com hoa extra o valor de: %.2f",total);
		
		
	   }

	}
}