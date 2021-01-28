package modeificadores;
import modificadores.abastracao.Carro;

public class aula43 {
	public static void main(String[] args) {
		Carro.setVML(190);
		Carro carro1 = new Carro("GTR",249.30);
		Carro carro2 = new Carro("GTI",299.30);
		Carro carro3 = new Carro("GTE",349.30);
		carro1.imprime();
		carro2.imprime();
		carro3.imprime();
		
		System.out.println("##################################");
		carro1.imprime();
		carro2.imprime();
		carro3.imprime();
	}
}
