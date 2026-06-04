package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.components.HeaderComponent;
import configuracao.Configuracao;
public class HomeSteps {

    HomePage homePage = new HomePage();
    HeaderComponent menu = new HeaderComponent();

    @Given("que acesso o site")
    public void acessarSite() {

        homePage.acessarSite(Configuracao.getString("url"));
    }
    
    @When("acesso a tela de login e cadastro")
    public void acessarTelaCadastro() {

        menu.acessarSignupLogin();
    }
    
    @When("acesso a tela de exclusão")
    public void acessarTelaExclusao() {

        menu.acessarDeleteAccount();
    }
    
    @When("realizo logout")
    public void realizo_logout() {
    	menu.acessarLogout();
    	
    }
    
    @When("acesso a tela de produtos")
    public void acesso_a_tela_de_produtos() {
    	menu.acessarProdutos(); 
    }
    
    @When("acesso a tela de carrinho")
    public void acesso_a_tela_de_carrinho() {
    	menu.acessarCart();
    }
    
}