package pages;

import org.openqa.selenium.By;

public class CreateAccountPage extends BasePage {

    private By lblContaCriada = By.cssSelector("[data-qa='account-created']");
    private By btnContinue = By.xpath("//a[text()='Continue']");

    public boolean contaCriada() {

       return isElementVisible(lblContaCriada); 

     
    }

    public void clicarContinuar() {

        click(btnContinue);
    }
}