package com.curso.java;

public class aula7 {

	public static void main(String[] args) {
		//operadoresUnarios();
		operadoresLogicos();
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
	 public static void operadoresLogicos() {
		 /*
		  * operadores logicos
		  * < menor que
		  * > maior que
		  * <= menor ou igual
		  * >= maior ou igual
		  * == igual
		  * != diferente de
		  * */
		 System.out.println(5 < 5); //false
		 System.out.println(5 <= 5); //true
		 System.out.println(5 > 5); //false
		 System.out.println(5 >= 5); //true
		 System.out.println(5 == 10); //false
		 //System.out.println(5 == 5); //true
		 System.out.println(5 != 10); //true
		 //System.out.println(5 != 5); //false
		 
		 
		 
		 
	 }

}
