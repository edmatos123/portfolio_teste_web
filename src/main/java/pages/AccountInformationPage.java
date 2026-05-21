package pages;

import org.openqa.selenium.By;

import modelo.Usuario;

public class AccountInformationPage extends BasePage {

    private String idGenero = "id_gender%s";
    private By txtSenha = By.id("password");
    private By cmbDia = By.id("days");
    private By cmbMes = By.id("months");
    private By cmbAno = By.id("years");
    private By txtPrimeiroNome = By.id("first_name");
    private By txtUltimoNome = By.id("last_name");
    private By txtEmpresa = By.id("company");
    private By txtEndereco = By.id("address1");
    private By txtEndereco2 = By.id("address2");
    private By cmbPais = By.id("country");
    private By txtEstado = By.id("state");
    private By txtCidade = By.id("city");
    private By txtCep = By.id("zipcode");
    private By txtCelular = By.id("mobile_number");
    private By btnCriar = By.cssSelector("[data-qa='create-account']");

    public void cadastrarUsuario(Usuario usr) {

        selecionarGenero(usr.getTipoGenero());

        sendKeys(txtSenha, usr.getSenha());

        selectByValue(cmbDia, usr.getDia());

        selectByText(cmbMes, usr.getMes());

        selectByValue(cmbAno, usr.getAno());

        sendKeys(txtPrimeiroNome, usr.getPrimeiroNome());

        sendKeys(txtUltimoNome, usr.getUltimoNome());

        sendKeys(txtEmpresa, usr.getEmpresa());

        sendKeys(txtEndereco, usr.getEndereco());

        sendKeys(txtEndereco2, usr.getEndereco2());

        selectByText(cmbPais, usr.getPais());

        sendKeys(txtEstado, usr.getEstado());

        sendKeys(txtCidade, usr.getCidade());

        sendKeys(txtCep, usr.getCep());

        sendKeys(txtCelular, usr.getCelular());

        click(btnCriar);
    }

    private void selecionarGenero(String genero) {

        String valorGenero = obterGenero(genero);

        By rdiGenero = By.id(String.format(idGenero, valorGenero));

        click(rdiGenero);
    }

    private String obterGenero(String genero) {

        switch(genero.toUpperCase()) {

            case "MR":
                return "1";

            case "MRS":
                return "2";

            default:
                throw new IllegalArgumentException("Genero invalido");
        }
    }
}