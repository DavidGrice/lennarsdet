package com.lennar.GUI;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.lennar.Actions.SharedActions.SharedActions;
import com.lennar.Actions.Lennar.LennarActions;

class LennarTests {

    // create private webdriver to be shared within test class
    private WebDriver driver;

    @Test
    void lennarTests() {

        // string for navigate to lennar website
        String webString = "https://assignment--lennar.netlify.app/";

        // validate string of webpage title
        String webPageTitle = "Lennar | New Homes For Sale - Building Houses and Communities";

        // instantiate web driver
        SharedActions sharedActions = new SharedActions(driver);

        // set webdriver to current driver
        driver = sharedActions.instantiateWebDriver();

        // open website
        sharedActions.navigateToWebsite(webString);

        // validate you are on Lennar home page
        sharedActions.validateWebpage(webPageTitle);

        // instantiate actions for lennar page passing in driver
        LennarActions lennarActions = new LennarActions(driver);
        
        // State to test
        String state = "Texas";
        
        // City to test
        String city = "Austin / Central Texas";

        // Filter to test
        String filter = "Availability";

        // Close cookie box
        lennarActions.clickCookieBoxClose();

        // Close promo box
        lennarActions.clickPromoBoxClose();

        // Click profile icon
        lennarActions.clickProfileIcon();

        // Click sign in or create
        lennarActions.clickSignInOrCreate();

        // Try signing up (website gives error, so you can not test this)
        lennarActions.trySignUp();

        // Select location dropdown
        lennarActions.selectLocationDropDown();

        // Select state
        lennarActions.selectLocationStateDropDown(state);
        
        // Select state
        lennarActions.selectLocationStateDropDown(state);

        // Select city
        lennarActions.selectLocationCityDropDown(city);

        // Select filter
        lennarActions.selectLocationFilter(filter);

        // Select move in ready box
        lennarActions.selectMoveInReadyBox();

        // Select filter
        lennarActions.selectLocationFilter(filter);

        // Close driver
        sharedActions.closeDriver();
    }
    
}
