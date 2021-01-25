package com.curso.java.abstracao.classes;
//exercicio
/*
 * Crie uma classe estudante
 * com os seguintes atributos
 * nome
 * idade
 * notas // tr�s notas
 * crie um m�todo para imprimir os dados e tirar a m�dia desse aluno
 * caso a m�dia seja maior que 6 imprimir aprovado, sen�o reprovado.
 * */
public class Estudante {
	private String nome;
	private int idade;
	private double[] notas;
	private boolean situacao;
	
	public void setar(String aluno, int idade, double... notas) {
		this.nome = aluno;
		this.idade = idade;
		this.notas = notas;
	}
	public void imprimir() {
		System.out.println("==============aluno=============");
		System.out.println("Aluno: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("==============notas=============");
		int i = 1;
		double media = 0;
		for(double nota : this.notas) {
			System.out.println(i+"� nota: "+nota );
			media+=nota;
			i++;
		}
		double resultado = media/(i-1);
		System.out.println("==============m�dia=============");
		System.out.println("m�dia: "+resultado);
		System.out.println("==============situa��o=============");
		if(resultado < 6) {
			System.out.println("Aluno reprovado!");
			this.situacao = false;
		}else if(resultado >= 6) {
			System.out.println("Aluno aprovado!");
			this.situacao = true;
		}
		
	}
	//getters e setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setIdade(int idade) {
		if(idade < 0) {
			System.out.println("Idade tem que ser maior que zero!");
			return;
		}
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setNota(double... notas) {
		this.notas = notas;
	}
	public double[] getNotas() {
		return this.notas;
	}
	//public void setAprovado(boolean situacao) {
	//	this.situacao = situacao;
	//}
	public boolean isAprovado() {
		return this.situacao;
	}
	
}
