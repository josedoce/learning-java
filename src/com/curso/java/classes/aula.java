package com.curso.java.classes;

import com.curso.java.abstracao.classes.Aluno;

public class aula {

	public static void main(String[] args) {
		//jose faz referencia a um objeto do tipo aluno
		Aluno jose = new Aluno();
		//aluno é um objeto que possui nome, matricula e idade, todo aluno terá esssa mesma caracteristica
		jose.nome = "Jose";
		jose.idade = 22;
		jose.matricula = "a3243";
		
		System.out.println(jose.nome);
		System.out.println(jose.idade);
		System.out.println(jose.matricula);
	}

}
