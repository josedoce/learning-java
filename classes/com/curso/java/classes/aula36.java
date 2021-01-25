package com.curso.java.classes;
import com.curso.java.abstracao.classes.Estudante;

public class aula36 {
	public static void main(String[] args) {
		Estudante aluno = new Estudante();
		aluno.setNome("joseildo");
		aluno.setIdade(22);
		aluno.setNota(1, 2, 3, 4);
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getIdade());
		for(double nota : aluno.getNotas()) {
			System.out.println(nota);
		}
	}
}
