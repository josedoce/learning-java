package com.curso.java;

public class Aula6 {

	public static void main(String[] args) {
		//tiposPrimitivos();
		operadoresUnarios();
		//exercicio1();
		//exercicio2();
	}
	 public static void tiposPrimitivos() {
		 int idade = 22;
		 double salarioDouble = 3000;
		 float salarioFloat = 3000;
		 byte idadeByte = 12;
		 short idadeShort = 32767;
		 boolean verdadeiro = true;
		 boolean falso = false;
		 long numeroGrande = 1000L;
		 char caractere = '\u0041'; //2bytes
		 String nome = "Joselito";
		 System.out.println("variavel int: "+  idade);
		 System.out.println("variavel double: "+  salarioDouble);
		 System.out.println("variavel float: "+  salarioFloat);
		 System.out.println("variavel byte: "+  idadeByte);
		 System.out.println("variavel short: "+  idadeShort);
		 System.out.println("variavel boolean: "+  verdadeiro);
		 System.out.println("variavel boolean: "+  falso);
		 System.out.println("variavel long: "+  numeroGrande);
		 System.out.println("variavel char: "+  caractere);
		 System.out.println("variavel string: "+  nome);
	 }
	 public static void operadoresUnarios() {
		 /*
		  * operadores
		  * symbol			Operator
		  * ++				increment
		  * -- 				decrement
		  * +				plus
		  * -				minus
		  * *				mult
		  * \/				div
		  * ()				cast
		  * !				Not
		  * % 				resto
		  * */
		 int n1 = 10, n2 = 34;
		 System.out.println(n1 + n2);
		 System.out.println("Inc: "+ (++n1));
		 System.out.println("Dec: "+(--n1));
		 System.out.println("Soma: "+(n1 + n2));
		 System.out.println("Mult: "+(n1 * n2));
		 System.out.println("Divi: "+(n1 / n2));
		 System.out.println("Subt: "+(n1 - n2));
		 System.out.println("Rest: "+(n1 % n2));
	 }
	 public static void exercicio1() {
		 //exercicio
		 //crie um algoritmo que possua variaveis para salvar os
		 //seguintes dados: nome, endereco e telefone de uma pessoa.
		 
		 //imprima essas variaveis da seguinte forma:
		 //O <nome> domiciliado no endereco <endereco> e telefone <telefone>
		 //nao possui nenhum tipo de pendencia.
		 
		 String nome = "joao", endereco = "rua pereira souza", telefone = "1829102030";
		 System.out.println("O "+nome+" domiciliado no endereco "+endereco+" e telefone "+telefone+" não possui nenhum tipo de pendencia.");
		 
	 }
	 public static void exercicio2() {
		 /*
		  * crie um algoritmo que possua as variaveis nome,
		  * salario, sexo(M ou F), idade, estado civil
		  * imprima da seguinte forma
		  * 
		  * O trabalhador(a) <nome> do sexo <sexo>, idade
		  * <idade>, estado civil <estado civil> e salario
		  * <salario> encontra-se empregado neste estabelecimento.*/
		 String nome = "joana", estadoCivil = "solteira";
		 char sexo = 'F';
		 int idade = 16;
		 float salario = 443;
		 String msg = "O(a) trabalhador(a) %s  do sexo %s, idade %s, estado civil %s e salario %s encontra-se empregado neste estabelecimento.".formatted(nome, sexo, idade, estadoCivil, salario);
		 System.out.println(msg);
	 }
	 
}
