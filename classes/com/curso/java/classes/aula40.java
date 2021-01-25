package com.curso.java.classes;
import com.curso.java.abstracao.classes.Medico;

public class aula40 {
	public static void main(String[] args) {
		Medico medico = new Medico(
				"923.234.211-34",
				"joana",
				new String[] {"seg","quar","sab","dom"},
				22
				);
		medico.setNome("jose");
		medico.imprime();
		
	}
}
