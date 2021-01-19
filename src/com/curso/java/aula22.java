package com.curso.java;

public class aula22 {
	public static void main(String[] args) {
		//formas de criar array unidimencional
		int[] atores = {1,2,3,4};
		int[] carros = new int[3];
		int[] ruas = new int[] {1, 2, 3, 4};
		
		//formas de criar array multidimencional
		//->array mtd não inicializado
		//int[][] dias = new int[3][];
		//dias[0] = new int[2];
		//dias[1] = new int[] {1,2,3};
		//dias[2] = new int[4];
		
		//->array mtd inicializado
		int[][] dias = {
				{0,0},
				{1,2,3},
				{0,0,0,0}
		};
		for(int[] arr : dias) {
			System.out.println("===========================");
			for(int num: arr) {
				System.out.println(num);
			}
		}
	}
}
