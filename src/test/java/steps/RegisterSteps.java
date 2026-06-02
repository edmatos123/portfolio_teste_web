package steps;

import dado.UsuarioFalso;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import modelo.Usuario;

import pages.AccountInformationPage;
import pages.CreateAccountPage;
import pages.DeleteAccountPage;
import pages.LoginSignupPage;
import validation.AccountValidation;
import configuracao.Configuracao;

public class RegisterSteps {

    LoginSignupPage telaLogin = new LoginSignupPage();
    AccountInformationPage telaCadastro =  new AccountInformationPage();
    CreateAccountPage telaCriacao = new CreateAccountPage();
    DeleteAccountPage telaExclusao = new DeleteAccountPage();
    AccountValidation validaConta = new AccountValidation();
    Usuario usr;


    @And("preencho os dados do novo usuário")
    public void preencherDadosUsuario() {

        usr = UsuarioFalso.criarUsuarioCompleto();
        telaLogin.preencherDadosIniciaisCadastro(usr);
        telaCadastro.preencherCadastrarUsuario(usr);
    }
    
    @When("preencho os dados do novo usuário com email existente")
    public void preencho_os_dados_do_novo_usuário_com_email_existente() {
    	usr = UsuarioFalso.criarUsuarioCompleto();
    	usr.email(Configuracao.getString("email_usuario"));    	
    	telaLogin.preencherDadosIniciaisCadastro(usr);
    }
    
    
    @And("confirmo a criação da conta")
    public void confirmarCriacaoConta() {
    	telaCadastro.confirmarCadastro();    
    }
    
    @Then("a conta é criada com sucesso")
    public void validarContaCriada() {
    	validaConta.validarContaCriadaSucesso();
        telaCriacao.clicarContinuar();
    }


    @Then("é informado que o email existe")
    public void é_informado_que_o_email_existe() {
    	validaConta.validarCadastroEmailExistente();
    }
    
    
}