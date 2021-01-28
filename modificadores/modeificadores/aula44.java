package modeificadores;
import modificadores.abastracao.Cliente;

public class aula44 {
	public static void main(String[] args) {
		//Cliente cliente = new Cliente();
		for(int parcela: Cliente.getParcela()) {
			System.out.println(parcela);
		}
		System.out.println("================================");
		for(int parcela: Cliente.getParcela()) {
			System.out.println(parcela);
		}
		
	}
}
