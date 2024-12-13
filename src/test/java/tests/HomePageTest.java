package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomePageTest extends BaseTest {

    @Test
    public void testHomePage(){
        homePage.open();
        // Assert that the title is displayed
        assertTrue(homePage.homePageTitle.isDisplayed(), "Home Page Title is not displayed!");

    }
}
