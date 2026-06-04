package configuracao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static String browser = Configuracao.getString("browser");
    
    public static WebDriver getDriver() {
    	         
        if(driver.get() == null) {
        	
        	switch (browser) {
        	
        	case "chrome":       	
        		WebDriverManager.chromedriver().setup(); 
                driver.set(new ChromeDriver());     	
                driver.get().manage().window().maximize();
        	break;
        	
        	default:
        	
        	}
        	
        	
        }

        return driver.get();
    }

    public static void quitDriver() {

        if(driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}