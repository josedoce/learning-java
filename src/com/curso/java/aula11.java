package com.curso.java;

public class aula11 {
	public static void main(String[] args) {
		int idade = 20;
		String status;
		status = idade < 18 ? "menor de idade" : "maior de idade";
		//System.out.println(status);
		exercicio();
	}
	public static void exercicio() {
		/*
		 * Crie uma variavel salario e imprima seu imposto
		 * imposto:
		 * salario < 1000 5%
		 * salario >= 1000 && salario < 2000 10%
		 * salario >= 2000 && salario < 4000 15%
		 * salario > 5000 20%
		 * */
		int salario = 900;
		int salarioJuros = 0;
		
		
		if(salario < 1000) {
			salarioJuros += (salario * 5)/100;
		}else if(salario >= 1000 && salario < 2000) {
			salarioJuros += (salario * 10)/100;
		}else if(salario >= 2000 && salario < 4000) {
			salarioJuros += (salario * 15)/100;
		}else if(salario > 5000) {
			salarioJuros += (salario * 20)/100;
		}
		System.out.println("salario: "+ salario);
		System.out.println("salario e imposto: "+ (salarioJuros + salario));
		System.out.println("Imposto: "+salarioJuros);
	}
}
