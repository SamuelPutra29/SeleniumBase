package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private static WebDriver driver;

    // method to initialize or retrieve WebDriver instance
    public static WebDriver getDriver(){
        if (driver==null){
            // Set path to chromedriver executable
            String chromeDriverPath= System.getProperty("user.dir") + "src/test/resources/Driver/chromedriver.exe";
            System.setProperty("Webdriver.chrome.driver", chromeDriverPath);
            driver = new ChromeDriver();
        }
        return driver;
    }

    // method to close webDriver
    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
