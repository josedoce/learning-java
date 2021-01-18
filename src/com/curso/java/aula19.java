package com.curso.java;

public class aula19 {
	public static void main(String[] args) {
		int [] idade = new int[3];
		/*quando um array é do tipo int, byte,short,
		 * long, float, double, automaticamente serão
		 *  inicializados, mas com valores 0 em seus indices*/
		
		/*
		 * para char o valor será \u0000 representando um valor vazio ' '*/
		
		/*para boolean o valor será false
		 * para reference o valor será null (Strings)
		 * */
		
		//System.out.println(idade[0]);
		
		//usando o foreach no array e length
		String[] nomes = new String[4];
		nomes[0] = "Fernando";
		nomes[1] = "Carlos";
		nomes[2] = "Henrique";
		nomes[3] = "Diego";
		for(int i=0; i<nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}
}
