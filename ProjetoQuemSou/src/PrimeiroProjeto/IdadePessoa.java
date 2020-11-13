package PrimeiroProjeto;

import java.util.*;

public class IdadePessoa {
	public static void main(String[] args) {

		int anos, meses, dias, totalDias;

		Scanner ler = new Scanner(System.in);
		System.out.print("entre com a quantia de anos: ");
		anos = ler.nextInt();

		System.out.print("entre com a quantia de meses: ");
		meses = ler.nextInt();

		System.out.print("entre com a quantia de dias: ");
		dias = ler.nextInt();
			ler.close();
			
		if (meses > 12 && meses < 1) {

			System.out.println("erro algum digito invalido");
		} else {

			int N1, N2, N3;

			N1 = anos * 365;
			N2 = meses * 30;
			totalDias = (N1 + N2) + dias;

			System.out.print("voce tem :" + totalDias + " dias de vida");
		}
	}

}
