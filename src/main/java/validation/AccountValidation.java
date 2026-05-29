package validation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import pages.CreateAccountPage;
import pages.DeleteAccountPage;
import pages.components.HeaderComponent;

public class AccountValidation {
	
	CreateAccountPage telaCadastro = new CreateAccountPage();
	DeleteAccountPage telaExclusao = new DeleteAccountPage();
	 HeaderComponent menu = new HeaderComponent();
	
	public void validarContaCriadaSucesso () {
		
		assertTrue(telaCadastro.contaCriada(),"A conta não foi cadastrada");
		
	}
	
	public void validarContaExcluidaSucesso () {
		
		assertTrue(telaExclusao.contaExcluida(),"A conta não  foi excluida");
		
	}
	
	public void validarLoginSucesso () {
		
		assertTrue(menu.menuLogoutVisivel(),"Login não foi realizado");
		
	}
	
	public void validarLogoutSucesso () {
		
		assertTrue(menu.menuSignupVisivel(),"Logout não foi realizado");
		
	}
	
	

}
