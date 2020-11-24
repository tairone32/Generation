package MinhaLoja;

public class Loja {
	public static void main(String[] args) {
		
		Televisor tv1 = new Televisor("Televisao",1990,"TVs001","LG",42,false);
		Televisor tv2 = new Televisor("Televisao",2300,"TVs002","PHILCO",50,false);
		SmartPhone cel1 = new SmartPhone("S10",4000.0f , "cel001","Samsung",58, 48);
		SmartPhone cel2 = new SmartPhone("A10", 600.0f, "cel002", "Samsung", 32, 12);
		System.out.println("Temos duas Tvs uma: "+tv1.getMarca()+"\t"+" E outra: "+tv2.getMarca());
		System.out.println("Temos duas Smart Phone uma: "+cel1.getMarca()+"\t"+" E outra: "+cel2.getMarca());
	}

}
