package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import modelo.Carrinho;
import modelo.Produto;

public class ProductsPage extends BasePage {

	
	private By txtSearch = By.id("search_product");
	private By btnSearch = By.id("submit_search");
	private By btnContinue = By.xpath("//button[text()='Continue Shopping']");	
	private By cardProdutos = By.cssSelector(".productinfo");
	String xpathProduto = "//p[text()='%s']";

	
	
	
	public void pesquisarProduto(String produto) {
		sendKeys(txtSearch,produto);
		click(btnSearch);
	}
	
	public boolean produtoVisivel(String descProduto) {
		By lblProduto = By.xpath(String.format(xpathProduto, descProduto));
		 
		 return isElementVisible(lblProduto);
		 
		 
	}
	
	public void adicionarProdutoCarrinho(int qtdProduto) {
			
		List<WebElement> elmtsProdutos = findElements(cardProdutos);
		
		for (int i=0 ; i < qtdProduto ; i++) {
			Produto produto = new Produto();
			WebElement card = elmtsProdutos.get(i);
			
			clickElement(card.findElement(By.cssSelector(".add-to-cart")));
		
			confirmarProdutoCarrinho();
			
			String desc = card.findElement(By.tagName("p")).getText();
			String valor = card.findElement(By.tagName("h2")).getText();
			
			produto.descProduto(desc).valorProduto(valor).qtdProduto(1);		
			Carrinho.adicionar(produto);
		}
		
	
		
	}
	
	public void confirmarProdutoCarrinho() {
		
		click(btnContinue);	
		
	}
	
}
