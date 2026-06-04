package validation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import modelo.Carrinho;
import modelo.Produto;
import pages.CartPage;

public class CartValidation {

	
	CartPage telaCarrinho = new CartPage();
	
	public void validarProdutosCarrinho() {
		
		List<Produto> produtoEsperado = Carrinho.obterProdutos();
		List<Produto> produtoObtido = telaCarrinho.obterProdutosCarrinho();
		
		assertEquals(produtoEsperado.size(),produtoObtido.size(),"Quantidade de produto divergente");
		
		
		for(int i = 0 ; i < produtoEsperado.size(); i++) {
			
			Produto esperado = produtoEsperado.get(i);
			Produto obtido = produtoObtido.get(i);
			
		assertEquals(esperado.getDescproduto(),obtido.getDescproduto(),"Nome do produto divergente");	
		assertEquals(esperado.getQtdProduto(),obtido.getQtdProduto(),"Quantidade do produto divergente");
		assertEquals(esperado.getValorProduto(),obtido.getValorProduto(),"Valor do produto divergente");
						
		}
		
		
	}
	
	
}
