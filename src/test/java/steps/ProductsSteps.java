package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductsPage;
import validation.ProductsValidation;
import configuracao.Configuracao;

public class ProductsSteps {
	
	ProductsPage telaProdutos = new ProductsPage();
	ProductsValidation validaProduto = new ProductsValidation();
	
	@When("pesquiso pelo produto")
	public void pesquiso_pelo_produto() {
		telaProdutos.pesquisarProduto(Configuracao.getString("produto_pesquisa"));
	}
	@Then("o produto é apresentado")
	public void o_produto_é_apresentado() {
		validaProduto.validarProdutoPesquisado(Configuracao.getString("produto_pesquisa"));
	}
	
	@When("adiciono {int} produtos ao carrinho")
	public void adiciono_produtos_ao_carrinho(int qtdProduto) {
		telaProdutos.adicionarProdutoCarrinho(qtdProduto);		
		
	}
	

}
