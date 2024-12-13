package factory;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.HomePage;

public class PageObjectFactory {
    private WebDriver driver;

    public PageObjectFactory(WebDriver driver) {
        this.driver = driver;
    }

    // Generic method to create page objects dynamically
    public <T extends BasePage> T createPage(Class<T> pageClass) {
        try {
            return pageClass.getConstructor(WebDriver.class).newInstance(driver);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to create page object for " + pageClass.getSimpleName());
        }
    }
}
