package com.curso.java.abstracao.classes;

public class Carro {
	public String placa;
	public String modelo;
	public float velocidade;
	
	public void imprimir(Carro carro) { //parametro do tipo carro
		System.out.println("Modelo: "+carro.modelo);
		System.out.println("Placa: "+carro.placa);
		System.out.println("Velocidade max: "+carro.velocidade);
	}
	public void propriedades() {
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Placa: "+this.placa);
		System.out.println("Velocidade max: "+this.velocidade);
	}
}
