package MinhaLoja;

public class Loja {
	public static void main(String[] args) {
		
		Televisor tv1 = new Televisor("Televisao",1990,"TVs001","LG",42,false);
		Televisor tv2 = new Televisor("Televisao",2300,"TVs002","PHILCO",50,false);
		
		System.out.println("Temos duas Tvs uma: "+tv1.getMarca()+"\t"+" E outra: "+tv2.getMarca());
	}

}
