package com.curso.java.abstracao.classes;

public class Calculadora {
	public void soma() {
		System.out.println(1 + 3);
	}
	public void subtrai() {
		System.out.println(8-2);
	}
	public void multiplica(int n1, int n2) {
		System.out.println(n1 * n2);
	}
	public double divisao(int n1, int n2) {
		if(n1 == 0 || n2 == 0) {
			return 0;
		}
		return n1 / n2;
	}
	public void somaArray (int[] numeros) {
		int soma = 0;
		for(int num : numeros) {
			soma += num;
		}
		System.out.println(soma);
	}
	public void somaArgs(int... numeros) {
		int soma = 0;
		for(int num : numeros) {
			soma += num;
		}
		System.out.println(soma);
	}
}
