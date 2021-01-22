package com.curso.java.classes;
import com.curso.java.abstracao.classes.Funcionarios;

public class aula38 {
	public static void main(String[] args) {
		Funcionarios funcionario = new Funcionarios();
		funcionario.init("joseildo", "232.344.112-34", 3200.30, "3234323");
		funcionario.imprime();
	}
}
