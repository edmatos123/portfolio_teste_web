package validation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import pages.CreateAccountPage;
import pages.DeleteAccountPage;

public class AccountValidation {
	
	CreateAccountPage telaCadastro = new CreateAccountPage();
	DeleteAccountPage telaExclusao = new DeleteAccountPage();
	
	
	public void validarContaCriadaSucesso () {
		
		assertTrue(telaCadastro.contaCriada(),"A conta não foi cadastrada");
		
	}
	
	public void validarContaExcluidaSucesso () {
		
		assertTrue(telaExclusao.contaExcluida(),"A conta não  foi excluida");
		
	}
	

}
