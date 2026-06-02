package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuracao.DriverFactory;
import configuracao.Configuracao;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {

        this.driver = DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(Configuracao.getInt("timeout")));
    }

    protected WebElement waitVisible(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected WebElement waitClickable(By by) {    	
    	return wait.until(ExpectedConditions.elementToBeClickable(by));    	
    }
    
    
    protected void click(By by) {
    	
    	
    	WebElement element = waitClickable(by);
    	
    	((JavascriptExecutor) driver)
        .executeScript("arguments[0].scrollIntoView({block: 'center'});",
                element
        );
    	element.click();
    }
    
 

    protected void sendKeys(By by, String text) {

        waitVisible(by).sendKeys(text);
    }

    protected String getText(By by) {

        return waitVisible(by).getText();
    }

    protected boolean isElementVisible(By by) {

        try {

            return waitVisible(by).isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }

    protected void selectByValue(By by, String value) {

        Select select = new Select(waitVisible(by));

        select.selectByValue(value);
    }

    protected void selectByText(By by, String text) {

        Select select = new Select(waitVisible(by));

        select.selectByVisibleText(text);
    }
}