package com.curso.java.abstracao.classes;

public class Medico {
	private String cpf;
	private String nome;
	private int idade;
	private String[] horario;
	
	public Medico(String cpf, String nome, String[] horario) { //construtor inicializador de variaveis
		this.cpf = cpf;
		this.nome = nome;
		this.horario = horario;
	}
	public Medico(String cpf, String nome, String[] horario, int idade) { //construtor inicializador de variaveis
		//usasse this() para chamar o construtor
		//regras:
		//1-so se chama construtor dentro de construtores
		//2-o construtor só pode ser chamado na primeira linha
		this(cpf, nome, horario); 
		this.idade = idade;
	}
	public Medico() { //construtor opcional
		
	}
	
	public void imprime() {
		System.out.println(this.cpf);
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println("--------------------");
		for(String horario : this.horario) {
			System.out.println(horario);
		}
		
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf; 
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome; 
	}
	
	public void setHorario(String[] horario) {
		this.horario = horario;
	}
	public String[] getHorario() {
		return this.horario;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
}
