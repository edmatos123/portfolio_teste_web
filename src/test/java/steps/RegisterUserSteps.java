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
import pages.components.HeaderComponent;
import validation.AccountValidation;

public class RegisterUserSteps {

    HeaderComponent menu = new HeaderComponent();
    LoginSignupPage telaLogin = new LoginSignupPage();
    AccountInformationPage telaCadastro =  new AccountInformationPage();
    CreateAccountPage telaCriacao = new CreateAccountPage();
    DeleteAccountPage telaExclusao = new DeleteAccountPage();
    AccountValidation validaConta = new AccountValidation();
    Usuario usr;

    @When("acesso a tela de login e cadastro")
    public void acessarTelaCadastro() {

        menu.acessarSignupLogin();
    }

    @And("preencho os dados do novo usuário")
    public void preencherDadosUsuario() {

        usr = UsuarioFalso.criarUsuarioCompleto();
        telaLogin.preencherDadosIniciaisCadastro(usr);
        telaCadastro.preencherCadastrarUsuario(usr);
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

    @When("acesso a tela de exclusão")
    public void acessarTelaExclusao() {

        menu.acessarDeleteAccount();
    }
    
    @Then("a conta é excluída com sucesso")
    public void validarContaExcluida() {

        validaConta.validarContaExcluidaSucesso();
        telaExclusao.clicarContinuar();
    }
    
    
    
}