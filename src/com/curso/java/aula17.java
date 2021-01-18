package com.curso.java;

public class aula17 {
	public static void main(String[] args) {
		//dado um valor de um carro, descrubra em quantas vezes ele pode ser parcelado
		//porém as parcelas não podem ser menores do que 1000
		
		double valorTotal = 30000;
		for(int parcela = 1; parcela <= valorTotal; parcela++) {
			double valorParcela = valorTotal / parcela;
			if(valorParcela < 1000) {
				break; //break finaliza a execução
			}
			//System.out.println("Parcela "+parcela+" R$"+valorParcela);
			
		}
		
		
		double valorTotal2 = 30000;
		for(int parcela = (int) valorTotal2; parcela >= 1; parcela--) {
			double valorParcela = (int) valorTotal2 / parcela;
			if(valorParcela<=1000) {
				continue; // nada abaixo do continue será executada.
			}
			System.out.println("Parcela "+parcela+" R$"+valorParcela);
		}
		
	}
}
