package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginSignupPage;
import validation.AccountValidation;
import configuracao.Configuracao;

public class LoginSteps {

    public String email;
    public String senha;
    
    LoginSignupPage telaLogin = new LoginSignupPage();
    AccountValidation validaConta = new AccountValidation();
	@And("realizo login")
	public void realizo_login() {	   
		
		email = Configuracao.getString("email_usuario");
		senha = Configuracao.getString("senha_usuario");
		telaLogin.fazerLogin(email, senha);		
	}

	@Then("o usuário é autenticado")
	public void o_usuário_é_autenticado() {
		
		validaConta.validarLoginSucesso();
	}

	
	
}
