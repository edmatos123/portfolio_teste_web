package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeleteAccountPage;
import pages.components.HeaderComponent;
import validation.AccountValidation;

public class AccountSteps {

	 HeaderComponent menu = new HeaderComponent();
	 DeleteAccountPage telaExclusao = new DeleteAccountPage();
	 AccountValidation validaConta = new AccountValidation();
	
		

    
    @Then("a conta é excluída com sucesso")
    public void validarContaExcluida() {

        validaConta.validarContaExcluidaSucesso();
        telaExclusao.clicarContinuar();
    }
	
	
	
	
}
