
package components;

import org.openqa.selenium.By;

import pages.BasePage;

public class HeaderComponent extends BasePage {

    private By btnSignupLogin = By.xpath("//a[text()=' Signup / Login']");
    private By btnDelete = By.xpath("//a[text()=' Delete Account']");

    
    
    public void acessarSignupLogin() {
    	click(btnSignupLogin);
    }
    
    public void acessarDeleteAccount() {
    	click(btnDelete);
    }
    
    
    
}