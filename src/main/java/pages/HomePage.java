package pages;



public class HomePage extends BasePage {

    public void acessarSite(String url) {

        driver.get(url);
    }
}