package MinhaLoja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Televisor tv1 = new Televisor("Televisor LG 4K", 1990, "tv001", "LG", 42, false);
		Televisor tv2 = new Televisor("Televisor PHILCO 1080p", 2300, "tv002", "PHILCO", 50, false);
		SmartPhone cel1 = new SmartPhone("SmartPhone S10", 4000.0f, "cel001", "Samsung", 58, 48);
		SmartPhone cel2 = new SmartPhone("SmartPhone A10", 600.0f, "cel002", "Samsung", 32, 12);
		Computador pc1 = new Computador("PC Exinos", 5500.00f, "pc001", "RTX 2080", 16, 900, "DELL");
		Computador pc2 = new Computador("PC InterStar", 3500.00f, "pc002", "GTX 1660", 8, 500, "POSITIVO");
		VideoGame ps5 = new VideoGame("Playstaion 5", 5000f, "ps001", "4K HDR 60fps");
		VideoGame xbox = new VideoGame("Xbox X", 3000f, "xb001", "4K ");

		List<Produto> estoque = new ArrayList<Produto>();
		System.out.println();
		estoque.add(tv1);
		estoque.add(tv2);
		estoque.add(cel1);
		estoque.add(cel2);
		estoque.add(pc1);
		estoque.add(pc2);
		estoque.add(ps5);
		estoque.add(xbox);
		System.out.println("Bem vindo(a)");
		System.out.println("Produtos disponiveis para compra: \n");

		for (Produto produto : estoque) {
			System.out.println("Código do produto: " + produto.getCodProduto() + " - " + produto.getName());
		}

		float somaCompra = 0f;

		int contPedido = 0;
		String cod = "";

		do {
			System.out.println("\nPara adicionar um produto ao seu pedido Digite o código do produto: ");
			cod = sc.nextLine();
			int cont = 0;
			for (int i = 0; i < estoque.size(); i++) {
				if (cod.equals(estoque.get(i).getCodProduto())) {
					somaCompra += estoque.get(i).getPreco();
					System.out.println("Produto: " + estoque.get(i).getName());
					cont++;
				}
				if (cont == 0 && i == (estoque.size() - 1)) {
					System.out.println("Código inválido...");
				}
			}
			do {
				System.out.println(
						"Digite [1] para finalizar compra || Digite [2] para adicionar mais produtos ao pedido.");
				contPedido = sc.nextInt();
				sc.nextLine();
				System.out.println();
			} while (contPedido != 1 && contPedido != 2);

		} while (contPedido != 1);

		System.out.println("\nSeu pedido tem o valor total: R$ " + String.format("%.2f", somaCompra));
		System.out.println("\nCompra finalizada.\nObrigado(a) por comprar conosco.");
		sc.close();
	}

}
