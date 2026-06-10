package configuracao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static String browser = Configuracao.getString("browser");
    
    public static WebDriver getDriver() {
    	         
        if(driver.get() == null) {
        	
        	switch (browser) {
        	
        	case "chrome":

        	    WebDriverManager.chromedriver().setup();

        	    ChromeOptions options = new ChromeOptions();

        	    if (System.getenv("CI") != null) {
        	        options.addArguments("--headless=new");
        	        options.addArguments("--no-sandbox");
        	        options.addArguments("--disable-dev-shm-usage");  
        	        options.addArguments("--window-size=1360,768");
        	    }

        	    driver.set(new ChromeDriver(options));

        	    if (System.getenv("CI") == null) {
        	        driver.get().manage().window().maximize();
        	    }

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