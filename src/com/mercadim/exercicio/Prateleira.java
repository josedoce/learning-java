package com.mercadim.exercicio;
import com.mercadim.exercicio.abstracao.*;


public class Prateleira {
	public static void main(String[] args) {
		Produtos ver = new Produtos(); //instancia de produtos
		Comprar item = new Comprar(); //instancia da compra
		Exibicao prateleira = new Exibicao(); //instancia da exibição de produtos.
		
		
		prateleira.viewProducts(ver.produtos);
		item.comprar("5");
	}
}
