
package pages.components;

import org.openqa.selenium.By;

import pages.BasePage;

public class HeaderComponent extends BasePage {

    private By btnSignupLogin = By.xpath("//a[text()=' Signup / Login']");
    private By btnDelete = By.xpath("//a[text()=' Delete Account']");
    private By btnLogout = By.xpath("//a[text()=' Logout']");
    private By btnProdutos = By.xpath("//a[text()=' Products']");
    
    public void acessarSignupLogin() {
    	click(btnSignupLogin);
    }
    
    public void acessarDeleteAccount() {
    	click(btnDelete);
    }
    
    public void acessarLogout() {
    	click(btnLogout);
    }
    
    public void acessarProdutos() {
    	click(btnProdutos);
    }
    
    public boolean menuLogoutVisivel() {
    	return isElementVisible(btnLogout);
    }
    
    public boolean menuSignupVisivel() {
    	return isElementVisible(btnSignupLogin);
    }
    
    
}