package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Locators using PageFactory = @FindBy
    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    public WebElement homePageTitle;
    
}
