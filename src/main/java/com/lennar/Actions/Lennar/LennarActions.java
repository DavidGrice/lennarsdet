package com.lennar.Actions.Lennar;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.lennar.Objects.Lennar.LennarObjects;

public class LennarActions {

    /*
     * Create private web driver
     * set constructor to passed in driver made in shared actions
     * Then set driver to that
     */
    private WebDriver driver;
    public LennarActions(WebDriver passedDriver) {
        driver = passedDriver;
    }

    // instnatiate private objects for open lending page
    private LennarObjects lennarObjects = new LennarObjects();

    /* 
     * clickCookieBoxClose - close cookie box
     */
    public void clickCookieBoxClose() {
        synchronized (driver) {
            try {
                driver.findElement(lennarObjects.cookieBoxClose()).click();
                driver.wait(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* 
     * clickPromoBoxClose - close promo box
     */
    public void clickPromoBoxClose() {
        synchronized (driver) {
            try {
                driver.findElement(lennarObjects.promoBoxClose()).click();
                driver.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* 
     * clickProfileIcon - click profile icon
     */
    public void clickProfileIcon() {
        synchronized (driver) {
            try {
                driver.findElement(lennarObjects.profileIconOpen()).click();
                driver.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* 
     * clickSignInOrCreate - click sign in or create
     */
    public void clickSignInOrCreate() {
        synchronized (driver) {
            try {
                driver.findElement(lennarObjects.signInOrCreate()).click();
                driver.wait(5000);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* 
     * trySignUp - try to sign up
     */
    public void trySignUp() {
        synchronized (driver) {
            try {
                Assert.assertFalse(driver.findElement(lennarObjects.signupInfoError()).isDisplayed());
                driver.wait(5000);
                clickCookieBoxClose();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* 
     * selectLocationDropDown - click drop down menu for location
     */
    public void selectLocationDropDown() {
        synchronized (driver) {
            try {
                clickCookieBoxClose();
                driver.findElement(lennarObjects.selectLocationDropDown()).click();
                driver.wait(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* 
     * selectLocationStateDropDown - select State
     */
    public void selectLocationStateDropDown(String location) {
        synchronized (driver) {
            try {
                driver.findElement(lennarObjects.selectLocation(location)).click();
                driver.wait(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* 
     * selectLocationStateDropDown - select State
     */
    public void selectLocationCityDropDown(String location) {
        synchronized (driver) {
            try {
                driver.findElement(lennarObjects.selectLocation(location)).click();
                driver.wait(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* 
     * selectLocationFilter - select filter drop down
     */
    public void selectLocationFilter(String filter) {
        synchronized (driver) {
            try {
                clickCookieBoxClose();
                driver.findElement(lennarObjects.selectFilter(filter)).click();
                driver.wait(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* 
     * selectMoveInReadyBox - select move in ready box
     */
    public void selectMoveInReadyBox() {
        synchronized (driver) {
            try {
                driver.findElement(lennarObjects.selectMoveInReady()).click();
                driver.wait(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
