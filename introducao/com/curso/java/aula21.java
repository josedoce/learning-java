package com.curso.java;

public class aula21 {
	public static void main(String[] args) {
		String[] nomes = {"Jose", "Maria", "George", "Henrique", "Peixoto"};
		
		
		for(String nome : nomes) {
			//System.out.println(nome);
		}
		int[][] dias = new int[2][4];
		
		
		 for(int i = 0; i < 4; i++) {
			 int selec = (int)Math.ceil(Math.round(Math.random()*4));
			 
			 dias[0][i] = selec;
			 dias[1][i] = selec; 
		 }
		 
		
		
		//System.out.println(dias[0][2]);
		//System.out.println(dias[1][0]);
		
		for(int[] ref : dias) {
			System.out.println("===========================");
			for(int dia : ref ) {
				System.out.println(dia);
			}
		}
	}
}
