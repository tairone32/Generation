package MinhaLoja;

public class Loja {
	public static void main(String[] args) {
		
		Televisor tv1 = new Televisor("Televisao",1990,"TVs001","LG",42,false);
		Televisor tv2 = new Televisor("Televisao",2300,"TVs002","PHILCO",50,false);
		SmartPhone cel1 = new SmartPhone("S10",4000.0f , "cel001","Samsung",58, 48);
		SmartPhone cel2 = new SmartPhone("A10", 600.0f, "cel002", "Samsung", 32, 12);
		Computador pc1 = new Computador("Exinos", 5500.00f, "pc001", "RTX 2080", 16, 900, "DELL");
		Computador pc2 = new Computador("InterStar", 3500.00f, "pc002", "GTX 1660", 8, 500, "POSITIVO");
		
		System.out.println("Temos duas Tvs uma: "+tv1.getMarca()+"\t"+" E outra: "+tv2.getMarca());
		System.out.println("Temos duas Smart Phone uma: "+cel1.getMarca()+"\t"+" E outra: "+cel2.getMarca());
		System.out.println("Temos duas Pcs uma: "+pc1.getMarca()+"\t"+" E outra: "+pc2.getMarca());
	}

}
