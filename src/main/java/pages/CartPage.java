package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import modelo.Produto;


public class CartPage extends BasePage{

	private By lst = By.cssSelector("tr[id^='product-']");
	
	public List<Produto> obterProdutosCarrinho(){
		
	List<WebElement> produtosCarrinho = findElements(lst);	
	List<Produto> produtos = new ArrayList<>();
	
	for(WebElement linhaProduto : produtosCarrinho ) {
		
		Produto produto = new Produto();
		
		produto.descProduto(linhaProduto.findElement(By.cssSelector(".cart_description a")).getText())
		.valorProduto(linhaProduto.findElement(By.cssSelector(".cart_price p")).getText())
		.qtdProduto(Integer.parseInt(linhaProduto.findElement(By.cssSelector(".cart_quantity button")).getText()));	
	
	produtos.add(produto);
	}
	
	
	return produtos;
		
	}
	
	
	
}
