package Collection;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class Lista {

	public static void main(String[] args) {
		
		
		Collection <String> itens =  new ArrayList();
		itens.add("Play Station 2");
		itens.add("Play Statio 3");
		itens.add("Play Station 4");
		itens.add("Play Station 5");
		
		System.out.println("\nLista de itens: "+itens);
		itens.remove("Play Station 2");
		System.out.println("\nLista de itens: "+itens);
		itens.clear();
		System.out.println("\nLista de itens: "+itens);
		itens.add("Play Station 2");
		itens.add("Play Station 3");
		itens.add("Play Station 4");
		itens.add("Play Station 5");
		System.out.println("\nContem Play Station 3? "+ itens.contains("Play Station 3"));
		System.out.println("\nLista de itens: "+itens);
		
		Collection <String> itens2 =  Arrays.asList("Controle PS2","Controle PS3","Controle PS4","Controle PS5");
		itens.addAll(itens2);
		
		System.out.println("\nTotal de itens no estoque: "+itens);
		
		for(String name : itens) {
			System.out.println("\nLista de itens no estoque: "+ name);
		}
	}
}
