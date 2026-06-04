package pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

	
	private By txtSearch = By.id("search_product");
	private By btnSearch = By.id("submit_search");
	String xpathProduto = "//p[text()='%s']";
	
	public void pesquisarProduto(String produto) {
		sendKeys(txtSearch,produto);
		click(btnSearch);
	}
	
	public boolean produtoVisivel(String descProduto) {
		By lblProduto = By.xpath(String.format(xpathProduto, descProduto));
		 
		 return isElementVisible(lblProduto);
		 
		 
	}
	
}
