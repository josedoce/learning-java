package com.curso.java.abstracao.classes;

public class Funcionarios {
	private String nome;
	private String cpf;
	private double salario;
	private String rg;
	public Funcionarios(String nome, String cpf, double salario, String rg) { //constructor
		//criando construtor
		//regras sobre o construtor: 
		//1- nunca retornará nada de nenhum tipo
		//aqui você poderá colocar regras etc...
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.rg = rg;
		
	}
	public Funcionarios() {
		//caso não queira passa nenhum valor crie uma sobrecarga 
	}
	//sobrecarga de metodos, é qiamdp java sabe lidar com isso buscando
	//o metodos com mesmo nome mas com assinatura diferente e exe-
	//cuta o que melhor se adequar
	//se tiver 3 parametros sendo atribuidos, eu executo este metodos
	//regras
	//1- só posso mudar o modigicador ou tipo de retorno
	//3- os parametros tem que ser diferentes
	public void init(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	//se tiver 4 parametros sendo atribuidos, eu executo este metodo
	public void init(String nome, String cpf, double salario, String rg) {
		//this.nome = nome;
		//this.cpf = cpf;
		//this.salario = salario;
		//a tarefa de inicio deve ficar com a antecessora init para evitar
		//muita verbosidade.
		init(nome, cpf, salario);
		this.rg = rg;
	}
	public void imprime() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Cpf: "+this.cpf);
		System.out.println("Salario: "+this.salario);
		System.out.println("Rg: "+this.rg);
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getRg() {
		return this.rg;
	}
}
