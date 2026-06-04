package modelo;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	
	private static List<Produto> produtos = new ArrayList<>();
	
	public static void adicionar(Produto produto) {
		produtos.add(produto);
	}
	
	public static List<Produto> obterProdutos(){
		return produtos;
	}
	
	public static void limpar() {
		
	
		produtos.clear();
		
	}
	
	
	
	
	
}
