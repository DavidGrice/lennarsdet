package com.lennar.Objects.Lennar;

import org.openqa.selenium.By;

public class LennarObjects {

    /* 
     * promoBoxClose - Closes promo
    */ 
    public By promoBoxClose() {
        return By.xpath("//button[@aria-label='Close promotion panel' and @type='button']");
    }

    /* 
     * cookieBoxClose - Closes cookie box modal
     */
    public By cookieBoxClose() {
        return By.xpath("//button[@id='onetrust-accept-btn-handler']");
    }

    /* 
     * profileIconOpen - Clicks profile icon
     */
    public By profileIconOpen() {
        return By.xpath("//button[@aria-label='open-panel' and @class='Button_root__heKK3 RoundButton_root__tXUhD IconButton_root__QOnhL RoundedCTA_iconButton__ZxOq_ Header_accountButton__MzFDr' and @type='button']");
    }

    /* 
     * signInOrCreate - Clicks sign in or create
     */
    public By signInOrCreate() {
        return By.xpath("//a[@class='AuthMenuContent_authLink__lP2HC']/span[@class='textLinkSmallNew Typography_textLinkSmallNew__JQYqG' and normalize-space(text())='Sign in or create']");
    }

    /* 
     * signupInfoError - Clicks sign in or create
     */
    public By signupInfoError() {
        return By.xpath("//h1[@class='headline1' and normalize-space(text())='Hmm, something went wrong.']");
    }

    /* 
     * selectLocationDropDown - Clicks select location drop down
     */
    public By selectLocationDropDown() {
        return By.xpath("//button/div[@data-testid='market-selector-value']");
    }

    /* 
     * selectLocation - Clicks specific data
     */
    public By selectLocation(String location) {
        return By.xpath(String.format("//li/button/span[@class='bodycopySmall' and normalize-space(text())='%s']/..", location));
    }

    /* 
     * selectFilter - Clicks specific data
     */
    public By selectFilter(String filter) {
        filter = filter.toLowerCase();
        return By.xpath(String.format("//button[@type='button' and @data-testid='search-results-filter-%s']", filter));
    }

    /* 
     * selectMoveInReady - Clicks move in ready homes box
     */
    public By selectMoveInReady() {
        return By.xpath("//span[@data-testid='quickmoveinhomes']");
    }
    
}
