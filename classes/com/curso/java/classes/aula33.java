package com.curso.java.classes;
import com.curso.java.abstracao.classes.Calculadora;

public class aula33 {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int[] numeros = {1,2,3,4,5};
		calc.somaArray(numeros);
		calc.somaArgs(numeros);
		calc.somaArgs(1,2,3,4,5,6);
		//regras varargs...
		//1-só pode ter um varargs por metodo
		//2-o varargs tem que ser o ultimo parametro (a, b, c, varargs...)
	}
}
