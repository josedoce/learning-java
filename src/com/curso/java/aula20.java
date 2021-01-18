package com.curso.java;

public class aula20 {

	public static void main(String[] args) {
		int[] numeros1 = new int[5]; //forma 1 de inicializar array
		int[] numeros2 = {1, 2, 3, 4, 5}; //forma 2 de inicializar array
		int[] numeros3 = new int[]{1, 2, 3, 4, 5}; //forma 3 de inicializar array
		
		//foreach
		for(int aux : numeros2) {
			System.out.println(aux);
		}
	}
	
}
