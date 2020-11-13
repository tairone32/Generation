package PrimeiroProjeto;
import java.util.*;
import java.math.*;

public class EventoFabrica {
	public static void main(String[] args) {
	
		int segundos,minutos,horas,seg;
		Scanner ler = new Scanner (System.in);
		System.out.printf("entre com os segundos: ");
		segundos = ler.nextInt();
		
		horas =	segundos / 3600;
		minutos = (segundos - (horas*3600))/60;
		seg = segundos -((horas * 3600)+(minutos * 60));	
		
		System.out.print("a duração do evento foi de: "+horas+"horas"+minutos+"minutos"+ seg+"segundos");
}
}
