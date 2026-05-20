package pages;

import org.openqa.selenium.By;

public class DeleteAccountPage extends BasePage {

    private By lblContaExcluida = By.cssSelector("[data-qa='account-deleted']");
    private By btnContinue = By.xpath("//a[text()='Continue']");

    public void validarContaExcluidaSucesso() {

        if(!isElementVisible(lblContaExcluida)) {

            throw new AssertionError(
                    "Conta nao excluida");
        }
    }

    public void clicarContinuar() {

        click(btnContinue);
    }
}