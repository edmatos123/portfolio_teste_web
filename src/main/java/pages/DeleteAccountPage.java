package pages;

import org.openqa.selenium.By;

public class DeleteAccountPage extends BasePage {

    private By lblContaExcluida = By.cssSelector("[data-qa='account-deleted']");
    private By btnContinue = By.xpath("//a[text()='Continue']");

    public boolean contaExcluida() {

        return isElementVisible(lblContaExcluida);

       
    }

    public void clicarContinuar() {

        click(btnContinue);
    }
}