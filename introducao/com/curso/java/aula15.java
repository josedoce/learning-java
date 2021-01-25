package com.curso.java;

public class aula15 {

	public static void main(String[] args) {
		int i = 0;
		while(i <= 10) {
			//System.out.println("while "+i);
			i ++;
		}
		
		i = 0;
		do {
			//System.out.println("do while "+i);
			i++;
		}while(i <= 10);
		
		for(int c = 0; c<=10; c++) {
			System.out.println("for "+c);
			if(c == 5) {
				//System.out.println("codigo parou aqui: ");
				break;
			}
		}
		exercicio();
	}
	public static void exercicio() {
		/*
		 * Imprima todos os numeros pares de 0 ate 100.000
		 * */
		for(int i = 0; i<=100000; i++ ) {
			if(i % 2 == 0) {
				System.out.println("É par: "+i);
			}
		}
	}

}
