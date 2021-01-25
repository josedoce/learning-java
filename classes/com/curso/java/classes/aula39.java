package com.curso.java.classes;
import com.curso.java.abstracao.classes.Funcionarios;

public class aula39 {
	public static void main(String[] args) {
		Funcionarios funcionario = new Funcionarios(
				"joseildo",
				"302.254.223-59",
				4000.30,
				"39403-3"
				);
		Funcionarios funcionario2 = new Funcionarios();
		
		funcionario.setNome("fernanda");
		funcionario.imprime();
		
	}
	
}
