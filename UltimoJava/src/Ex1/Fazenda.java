package Ex1;

public class Fazenda {
	public static void main(String[] args) {
		
		Cachorro dog =new Cachorro("Vira-Lata",4,"au au au","corre late e pula");
		Cavalo horse =new Cavalo("P�-de-Pano",20,"pocoto","corre trota pula e nada");
		Pregui�a laziness =new Pregui�a("Dorme-Dorme",4,"Ronco");
		
		laziness.setOqueFaz("nada");
		
		System.out.println("\nNome do cachorro: "+dog.getNomes()+"\tIdade: "+dog.getIdade()+"\tSom: "+dog.getEmitirSom()+"\tFaz: "+dog.oqueFaz);
		System.out.println("\nNome do cavalo: "+horse.getNomes()+"\tIdade: "+horse.getIdade()+"\tSom:"+dog.getEmitirSom()+"\tFaz: "+horse.oqueFaz);
		System.out.println("\nNome da pregui�a: "+laziness.getNomes()+"\tIdade: "+laziness.getIdade()+"\tSom: "+laziness.getEmitirSom()+"\tFaz: "+laziness.getOqueFaz());
	}

}
