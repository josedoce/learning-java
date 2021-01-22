package com.curso.java.classes;
import com.curso.java.abstracao.classes.Estudante;

public class aula35 {

	public static void main(String[] args) {
		Estudante aluno = new Estudante();
		
		double[] notas = {4.0, 10.0, 5.0};
		aluno.setar("joseildo", 22, notas);
		aluno.imprimir();
		
	}

}
