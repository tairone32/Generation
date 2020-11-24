package MinhaLoja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Televisor tv1 = new Televisor("Televisao LG 4K", 1990, "TVs001", "LG", 42, false);
		Televisor tv2 = new Televisor("Televisao PHILCO 1080p", 2300, "TVs002", "PHILCO", 50, false);
		SmartPhone cel1 = new SmartPhone("S10", 4000.0f, "cel001", "Samsung", 58, 48);
		SmartPhone cel2 = new SmartPhone("A10", 600.0f, "cel002", "Samsung", 32, 12);
		Computador pc1 = new Computador("Exinos", 5500.00f, "pc001", "RTX 2080", 16, 900, "DELL");
		Computador pc2 = new Computador("InterStar", 3500.00f, "pc002", "GTX 1660", 8, 500, "POSITIVO");
		VideoGame ps5 = new VideoGame("Playstaion 5", 5000f, "ps5", "4K HDR 60fps");
		VideoGame xbox = new VideoGame("Xbox X", 3000f, "xbxX", "4K ");
		/*
		System.out.println("Temos duas Tvs uma: " + tv1.getMarca() + "\t" + " E outra: " + tv2.getMarca());
		System.out.println("Temos duas Smart Phone uma: " + cel1.getMarca() + "\t" + " E outra: " + cel2.getMarca());
		System.out.println("Temos duas Pcs uma: " + pc1.getMarca() + "\t" + " E outra: " + pc2.getMarca());
		*/
		
		
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
		System.out.println("Bem vindo");
		System.out.println("Produto disponiveis para compra:");
		
		for (Produto produto : estoque) {
			System.out.println("Codigo do produto: "+ produto.getCodProduto() +" - "+ produto.getName());
		}
		
		//List<Produto> compra = new ArrayList<>();
		float somaCompra = 0f;
		
		int contPedido = 0;
		String cod ="";
		
		do {
		System.out.println("Digite o codigo do produto: ");
		cod = sc.nextLine();	
		
		for (int i = 0; i < estoque.size(); i++) {			
			if (cod.equals(estoque.get(i).getCodProduto()) ) {
				somaCompra += estoque.get(i).getPreco(); 
				System.out.println("Produto: "+estoque.get(i).getName());
			}
		}		
		System.out.println("[1] para finalizar compra || [2] para continuar");
		contPedido = sc.nextInt();
		sc.nextLine();
		System.out.println();
			
		}while(contPedido != 1);
		
		System.out.println("\nSeu pedido tem o valor total: R$ "+String.format("%.2f", somaCompra) );
		
		sc.close();
	}

}
