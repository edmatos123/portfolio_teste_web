package steps;

import io.cucumber.java.en.Then;
import validation.CartValidation;

public class CartSteps {

	
	CartValidation validaCarrinho = new CartValidation();
	
	@Then("os produtos são apresentados no carrinho")
	public void os_produtos_são_apresentados_no_carrinho() {
	
		validaCarrinho.validarProdutosCarrinho();
		
	}
	
}
