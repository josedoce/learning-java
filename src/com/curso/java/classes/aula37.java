package com.curso.java.classes;
import com.curso.java.abstracao.classes.Estudante;

public class aula37 {
	public static void main(String[] args) {
		Estudante aluno = new Estudante();
		double[] notas = {2.3, 9.5, 8.0};
		aluno.setar("joão", 15, notas);
		aluno.imprimir();
		System.out.println("Aluno aprovado: "+aluno.isAprovado());
	}
}
