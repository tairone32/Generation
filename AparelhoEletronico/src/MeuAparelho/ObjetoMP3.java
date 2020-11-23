package MeuAparelho;

public class ObjetoMP3 {
	public static void main(String[] args) {

		MP3 mp3 = new MP3(1, 5, "preto", "128 GB", 1);
		
		if (mp3.getMusicas()>500) {
			System.out.println("\n"+mp3.getMusicas()+"Musicas aleatorias ouvindo agora");
		}
		else {
			System.out.println("\nR&B "+ mp3.getMusicas()+"- Ouvindo agora");
		}
			
		System.out.println("\nVolume: "+mp3.getVolume());
		
		System.out.println("\nCor: "+mp3.getCor());
		
		System.out.println("\nMemoria: "+mp3.getMemoria());
		
		if(mp3.getRadio()>0) {
			System.out.println("\nRadio desligado");
		}
		else {
			System.out.println("\nRadio Ligado");
		}
			
	}

}
