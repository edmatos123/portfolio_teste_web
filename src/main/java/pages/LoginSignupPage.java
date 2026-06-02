package pages;

import org.openqa.selenium.By;

import modelo.Usuario;

public class LoginSignupPage extends BasePage {

    private By txtNome = By.name("name");
    private By txtEmail = By.cssSelector("[data-qa='signup-email']");
    private By btnSignup = By.cssSelector("[data-qa='signup-button']");
    private By txtEmailLogin = By.cssSelector("[data-qa='login-email']");
    private By txtSenhaLogin = By.cssSelector("[data-qa='login-password']");
    private By btnLogin = By.cssSelector("[data-qa='login-button']");
    private By lblMsgEmailExiste= By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p");

    public void preencherDadosIniciaisCadastro(Usuario usr) {

        sendKeys(txtNome, usr.getNomeCompleto());

        sendKeys(txtEmail, usr.getEmail());

        click(btnSignup);
    }
    
    
    public void fazerLogin(String email, String senha) {

        sendKeys(txtEmailLogin, email);

        sendKeys(txtSenhaLogin, senha);

        click(btnLogin);
    }
    
    
    public boolean msgEmailExistenteVisivel() {
    	return isElementVisible(lblMsgEmailExiste);
    }
    
    public String msgEmailExistente() {
    	return getText(lblMsgEmailExiste);
    }
    
    
}