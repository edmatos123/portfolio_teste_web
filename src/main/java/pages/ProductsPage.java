package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {

	
	private By txtSearch = By.id("search_product");
	private By btnSearch = By.id("submit_search");
	private By btnContinue = By.xpath("//button[text()='Continue Shopping']");
	private By btnAddCarrinho = By.xpath("//a[@data-product-id]");
	String xpathProduto = "//p[text()='%s']";
	String cssProdutos = "[data-product-id='%s']";
	
	public void pesquisarProduto(String produto) {
		sendKeys(txtSearch,produto);
		click(btnSearch);
	}
	
	public boolean produtoVisivel(String descProduto) {
		By lblProduto = By.xpath(String.format(xpathProduto, descProduto));
		 
		 return isElementVisible(lblProduto);
		 
		 
	}
	
	public void adicionarProdutoCarrinho(int qtdProduto) {
			
		List<WebElement> elmtsProdutos = findElements(btnAddCarrinho);
		
		for (int i=0 ; i < qtdProduto ; i++) {
			//elmtsProdutos.get(i*2).click();
			clickElement(elmtsProdutos.get(i*2));
			confirmarProdutoCarrinho();
		}
		
		
		//for (int i=1 ; i < qtdProduto + 1 ; i++) {			
		//	click(By.cssSelector(String.format(cssProdutos, i)));
		//	confirmarProdutoCarrinho();
		//}
		
		 
		
		
	}
	
	public void confirmarProdutoCarrinho() {
		
		click(btnContinue);	
		
	}
	
}
