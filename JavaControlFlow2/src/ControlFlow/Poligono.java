package ControlFlow;
import java.util.*;
import java.math.*;
public class Poligono {

	public static void main(String[] args) {
		
		
		int lados;
		float centimetros,trianguloArea,quadradoArea,pentagonoArea;
		Scanner ler = new Scanner (System.in);
		System.out.println("Escreva Quantos lados tem o Poligono: ");
		lados=ler.nextInt();
		
		System.out.println("\nEscreva quantos centimetros: ");
		centimetros=ler.nextFloat();
		
		if(lados==3) {
			//base*altura/2
			trianguloArea= lados* centimetros;
			System.out.println("Triângulo!");
			System.out.printf("\nCom a area de: %.2",trianguloArea);
		}
		if (lados==4) {
			//base * altura
			quadradoArea= lados*centimetros;
			System.out.println("Quadrado!");
			System.out.printf("\nCom a area de: %.2",quadradoArea);
			}
		else if (lados==5){
			//(base*5)8 altura
			pentagonoArea=lados*centimetros;
			System.out.println("Pentagono!");
			System.out.printf("\nCom a area de: %.2",pentagonoArea);
		}
	}
}
