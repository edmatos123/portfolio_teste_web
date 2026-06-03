package validation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import pages.ProductsPage;

public class ProductsValidation {

	ProductsPage telaProdutos = new ProductsPage();
	
	public void validarProdutoPesquisado (String descProduto) {
		

		assertTrue(telaProdutos.produtoVisivel(descProduto),"O produto pesquisado não foi retornado");
	}
	
}
