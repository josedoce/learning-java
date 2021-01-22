package com.curso.java.classes;
import com.curso.java.abstracao.classes.Carro;

public class aula31 {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "gol";
		carro.placa = "rst 4n21";
		carro.velocidade = 300;
		
		carro.imprimir(carro);
		Carro carro2 = new Carro();
		carro2.modelo = "uno";
		carro2.placa = "bbn 2u90";
		carro2.velocidade = 180;
		
		carro.imprimir(carro2);
	}
}
