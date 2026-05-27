package steps;

import dado.UsuarioFalso;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import modelo.Usuario;

import pages.AccountInformationPage;
import pages.CreateAccountPage;
import pages.DeleteAccountPage;
import pages.LoginSignupPage;
import pages.components.HeaderComponent;

public class RegisterUserSteps {

    HeaderComponent menu = new HeaderComponent();
    LoginSignupPage telaLogin = new LoginSignupPage();
    AccountInformationPage telaCadastro =  new AccountInformationPage();
    CreateAccountPage telaCriacao = new CreateAccountPage();
    DeleteAccountPage telaExclusao = new DeleteAccountPage();
    Usuario usr;

    @When("acesso a tela de cadastro")
    public void acessarTelaCadastro() {

        menu.acessarSignupLogin();
    }

    @When("preencho os dados do novo usuário")
    public void preencherDadosUsuario() {

        usr = UsuarioFalso.criarUsuarioCompleto();
        telaLogin.preencherDadosIniciaisCadastro(usr);
        telaCadastro.cadastrarUsuario(usr);
    }

    @When("confirmo a criação da conta")
    public void confirmarCriacaoConta() {

        telaCriacao.validarContaCriadaSucesso();
        telaCriacao.clicarContinuar();
    }

    @Then("eu excluo a conta")
    public void excluirConta() {

        menu.acessarDeleteAccount();
        telaExclusao.validarContaExcluidaSucesso();
        telaExclusao.clicarContinuar();
    }
}