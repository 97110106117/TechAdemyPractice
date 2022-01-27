package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    String homePageUrl ="https://the-internet.herokuapp.com/";

    @FindBy(linkText = "Form Authentication")
    private WebElement lnkFormAuthentication;

    @FindBy(linkText = "Forgot Password")
    private WebElement lnkForgotPassword;

    @FindBy(linkText = "Dynamic Controls")
    private WebElement lnkDynamicLControls;

    @FindBy(linkText = "Disappearing Elements")
    private WebElement lnkDisappearingElement;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void isFormAuthenticationVisible() {

        lnkFormAuthentication.isDisplayed();
    }

}
