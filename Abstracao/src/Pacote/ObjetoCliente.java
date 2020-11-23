package Pacote;

public class ObjetoCliente {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("jose","Silva",322456387,"josedev.silva@gmail.com",456243957);
		
		System.out.println("nome do cliente: "+cliente1.getNomeCompleto() +"\t" + cliente1.getCpf() +"\t" + cliente1.getEmail() +"\t"+
				cliente1.getTelefone());
		
	}

}
