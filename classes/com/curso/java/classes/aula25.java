package com.curso.java.classes;
import com.curso.java.abstracao.classes.Carro;

public class aula25 {
	 public static void main(String[] args) {
		 Carro carro = new Carro();
		 carro.modelo = "hb20i";
		 carro.placa = "znv 2t32";
		 carro.velocidade = 180;
		 
		 System.out.println(carro.modelo);
		 System.out.println(carro.placa);
		 System.out.println(carro.velocidade);
	 }
}
