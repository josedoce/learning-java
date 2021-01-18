package com.curso.java;

public class aula10 {
	public static void main(String[] args) {
		String nome = "", usuario = "";
		
		if(usuario == "adm") {
			nome = "bem vindo, adm joseildo";
		}else if(usuario == "user") {
			nome = "bem vindo, user joseildo";
		}else {
			nome = "bem vindo, convidado";
		}
		System.out.println(nome);
	}
}
