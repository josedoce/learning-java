package com.curso.java.classes;
import com.curso.java.abstracao.classes.Calculadora;

public class aula29 {
	public static void main(String[] args) {
		Calculadora calculo = new Calculadora();
		double result = calculo.divisao(10, 2);
		System.out.println(result);
	}
}
