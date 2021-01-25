package com.mercadim.exercicio.abstracao;

public class Comprar {
	private static String mensagem = "O produto foi comprado com sucesso!";
	public void comprar(String id) {
		
		Produtos ver = new Produtos();
		
		for(String[] ref : ver.produtos) {
			if(ref[0] == id) {
				System.out.println("==============================");
				System.out.println(mensagem);
				System.out.println("produto: "+ref[1]);
				System.out.println("preço: "+ref[2]);
				System.out.println("setor: "+ref[3]);
			}
		}
		
	}
	
}
