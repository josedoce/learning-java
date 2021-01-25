package com.curso.java;

public class aula13 {
	public static void main(String[] args) {
		//switch e exercicios
		byte dia = 8;
		String diaNome = "";
		switch(dia) {
		//tipos aceitos pelo swirch:
		//char, int, byte, short, enum e string
			case 1:
				diaNome = "Domingo";
				break;
			case 2:
				diaNome = "Segunda";
				break;
			case 3:
				diaNome = "Terça";
				break;
			case 4:
				diaNome = "Quarta";
				break;
			case 5:
				diaNome = "Quinta";
				break;
			case 6:
				diaNome = "Sexta";
				break;
			case 7:
				diaNome = "Sabado - final de semana";
				break;
			default:
				diaNome = "Dia invalido";
		}
		//System.out.println(diaNome);
		exercicio();
	}
	public static void exercicio() {
		byte diaUtil = 8;
		String tx = "";
		switch(diaUtil) {
			case 1: 
			case 7:
				tx = "fim de semana";
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				tx = "dia util";
				break;
			default:
				tx = "dia invalido";
		}
		System.out.println(tx);
	}
}
