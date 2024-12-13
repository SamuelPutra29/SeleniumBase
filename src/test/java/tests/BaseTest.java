package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ABTestingPage;
import pages.BasePage;
import pages.HomePage;
import utils.WebDriverManager;

import java.util.Scanner;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    protected ABTestingPage abTestingPage;


    @BeforeMethod
    public void setUp() {
        driver = WebDriverManager.getDriver();
        basePage = new BasePage(driver);
        homePage = new HomePage(driver);
        abTestingPage = new ABTestingPage(driver);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(1000);
            WebDriverManager.closeDriver();
        }
    }
}