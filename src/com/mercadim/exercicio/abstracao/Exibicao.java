package com.mercadim.exercicio.abstracao;

public class Exibicao {
	public void viewProducts(String[][] produtos) {
		int i = 0;
		
		String[] categoria = {"id","produto","preço","setor"};
		
		for(String[] ref : produtos) {
			System.out.println("---------------------------------");
			for(String produto : ref) {
				System.out.println(categoria[i] +" : "+produto);
				i++;
			}
			i = 0;
		}
		
	}
}
