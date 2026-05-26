package steps;

import io.cucumber.java.en.Given;

import pages.HomePage;
import configuracao.Configuracao;
public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("que acesso o site")
    public void acessarSite() {

        homePage.acessarSite(Configuracao.getString("url"));
    }
}