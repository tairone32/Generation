package PrimeiroProjeto;

import java.math.*;
import java.util.*;

public class InteirosPositivos {
	
	public static void main(String[] args) {
		
		int A,B,C,D,R,S;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("Entre com o valor A ");
		A = ler.nextInt();
		
		System.out.printf("Entre com o valor B ");
		B = ler.nextInt();
		
		System.out.printf("Entre com o valor C ");
		C = ler.nextInt();
		
		R = (int)Math.pow(A + B, 2);
		S = (int)Math.pow(C + B, 2);
		
		D = (R + S)/2;
		
		System.out.printf("o valor de  D é: " + D);
	}

}
