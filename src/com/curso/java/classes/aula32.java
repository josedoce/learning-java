package com.curso.java.classes;
import com.curso.java.abstracao.classes.Carro;

public class aula32 {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "corsa";
		carro.placa = "gst 3s32";
		carro.velocidade = 230;
		carro.propriedades();
	}
}
