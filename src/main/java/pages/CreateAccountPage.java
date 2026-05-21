package pages;

import org.openqa.selenium.By;

public class CreateAccountPage extends BasePage {

    private By lblContaCriada = By.cssSelector("[data-qa='account-created']");
    private By btnContinue = By.xpath("//a[text()='Continue']");

    public void validarContaCriadaSucesso() {

        if(!isElementVisible(lblContaCriada)) {

            throw new AssertionError("Conta nao criada");
        }
    }

    public void clicarContinuar() {

        click(btnContinue);
    }
}