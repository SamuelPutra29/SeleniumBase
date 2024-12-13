package tests;

import org.testng.annotations.Test;

public class ABTest extends BaseTest {

    @Test
    public void testABTesting(){
        // open the home page
        homePage.open();

        // click ab testing title
        abTestingPage.ABTestingTitle.click();

        //

    }

}
