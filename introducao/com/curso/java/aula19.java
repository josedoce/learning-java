package com.curso.java;

public class aula19 {
	public static void main(String[] args) {
		int [] idade = new int[3];
		/*quando um array � do tipo int, byte,short,
		 * long, float, double, automaticamente ser�o
		 *  inicializados, mas com valores 0 em seus indices*/
		
		/*
		 * para char o valor ser� \u0000 representando um valor vazio ' '*/
		
		/*para boolean o valor ser� false
		 * para reference o valor ser� null (Strings)
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
