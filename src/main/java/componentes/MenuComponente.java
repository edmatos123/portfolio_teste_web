
package componentes;

import org.openqa.selenium.By;

import pages.BasePage;

public class MenuComponente extends BasePage {

    private By btnSignupLogin = By.xpath("//a[text()=' Signup / Login']");
    private By btnDelete = By.xpath("//a[text()=' Delete Account']");

    public void acessarMenu(String menu) {

        switch(menu) {

            case "Signup/Login":
                click(btnSignupLogin);
                break;

            case "Delete Account":
                click(btnDelete);
                break;

            default:
                throw new IllegalArgumentException("Menu inválido");
        }
    }
}