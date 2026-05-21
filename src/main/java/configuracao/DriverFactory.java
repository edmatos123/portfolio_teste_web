package configuracao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
    	         
        if(driver.get() == null) {

            driver.set(new ChromeDriver());        	
        	WebDriverManager.chromedriver().setup();          
            driver.get().manage().window().maximize();
        }

        return driver.get();
    }

    public static void quitDriver() {

        if(driver.get() != null) {
            driver.get().quit();
            driver = null;
        }
    }
}