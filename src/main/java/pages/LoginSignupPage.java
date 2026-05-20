package pages;

import org.openqa.selenium.By;

import modelo.Usuario;

public class LoginSignupPage extends BasePage {

    private By txtNome = By.name("name");
    private By txtEmail = By.cssSelector("[data-qa='signup-email']");
    private By btnSignup = By.cssSelector("[data-qa='signup-button']");

    public void preencherDadosIniciaisCadastro(Usuario usr) {

        sendKeys(txtNome, usr.getNomeCompleto());

        sendKeys(txtEmail, usr.getEmail());

        click(btnSignup);
    }
}