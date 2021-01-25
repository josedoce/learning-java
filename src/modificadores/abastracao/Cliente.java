package modificadores.abastracao;

public class Cliente {
	//segunda forma de inicializar
		//passos seguidos pelo java
		// 0 - Bloco de inicialização é executado quando a JVM carrega a classe(é executado apenas 1 vez)
		// 1 - Alocado espaco na memoria para o objeto que será criado
		// 2 - Cada atributo de classe é criado e inicializado com seus
		// valores default ou valores explicitos
		// 3 - Bloco de inicialização é executado
		// 4 - O construtor é executado
		private static int[] parcelas;

		static { //um bloco de inicialização static só será executado uma unica vez
			//bloco de inicialização será o primeiro a ser executado
			//podendo ser colocado em qualquer parte do codigo dentro do objeto
			//porem, por etica, deve ser colocado antes do construtor
			System.out.println("bloco inicializador");
			//inicializar array
			Cliente.parcelas = new int[15];
			
			for(int i = 1; i < 16; i++) {
				Cliente.parcelas[i-1] = i;
			}
		}
		
		public Cliente() {
			
		}
		
		public static int[] getParcela() {
			return Cliente.parcelas;
		}
}
