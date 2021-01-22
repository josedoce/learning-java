package com.curso.java.abstracao.classes;

public class BlocoInicializador {
	//segunda forma de inicializar
	//passos seguidos pelo java
	// 1 - Alocado espaco na memoria para o objeto que será criado
	// 2 - Cada atributo de classe é criado e inicializado com seus
	// valores default ou valores explicitos
	// 3 - Bloco de inicialização é executado
	// 4 - O construtor é executado
	private int[] parcelas;
	{
		//bloco de inicialização será o primeiro a ser executado
		//podendo ser colocado em qualquer parte do codigo dentro do objeto
		//porem, por etica, deve ser colocado antes do construtor
		System.out.println("bloco inicializador");
		//inicializar array
		parcelas = new int[15];
		for(int i = 1; i < 16; i++) {
			parcelas[i-1] = i;
		}
	}
	public BlocoInicializador() {
		for(int parcela : this.parcelas) {
			System.out.println(parcela + " ");
		}
	}
	
	public void setParcela(int[] parcela) {
		this.parcelas = parcela;
	}
	public int[] getParcela() {
		return this.parcelas;
	}
}
