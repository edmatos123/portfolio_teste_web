
package pages.components;

import org.openqa.selenium.By;

import pages.BasePage;

public class HeaderComponent extends BasePage {

    private By btnSignupLogin = By.xpath("//a[text()=' Signup / Login']");
    private By btnDelete = By.xpath("//a[text()=' Delete Account']");
    private By btnLogout = By.xpath("//a[text()=' Logout']");
    
    
    public void acessarSignupLogin() {
    	click(btnSignupLogin);
    }
    
    public void acessarDeleteAccount() {
    	click(btnDelete);
    }
    
    public void acessarLogout() {
    	click(btnLogout);
    }
    
    public boolean menuLogoutVisivel() {
    	return isElementVisible(btnLogout);
    }
    
    public boolean menuSignupVisivel() {
    	return isElementVisible(btnSignupLogin);
    }
    
    
}