package internetHeroKuappPages.pages;

import internetHeroKuappPages.common.CommonFunctionalities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonFunctionalities {

    CommonFunctionalities commons;

    private  String  homePageUrl ="https://the-internet.herokuapp.com/";

    @FindBy(linkText = "Forgot Password")
    private WebElement forgotPasswordLnk;

    @FindBy(linkText = "Form Authentication")
    private WebElement loginLnk;

    @FindBy(linkText = "Disappearing Elements")
    private WebElement disappearingElementLnk;

    @FindBy(linkText = "Dynamic Controls")
    private WebElement dynamicControlsLnk;

    public HomePage(WebDriver driver) {
        super(driver);
        commons = new CommonFunctionalities(driver);
    }

    /** open page using its url*/
    public void open() {
        commons.openUrl(homePageUrl);
    }

    /** open Login page by clicking on Login lnk*/
    public LoginPage clickLogin() {
        commons.click(loginLnk);
        return new LoginPage(getDriver());
    }

    /** open ForgotPassword page by clicking on forgot password lnk*/
    public ForgotPasswordPage clickForgotPassword() {
        commons.click(forgotPasswordLnk);
        return new ForgotPasswordPage(getDriver());
    }

    /** open DisappearingElementPage by clicking on DisappearingElement lnk*/
    public DisappearingElementPage clickDisappearingElement() {
       commons.click(disappearingElementLnk);
        return new DisappearingElementPage(getDriver());
    }

    /** open DynamicControlsPage by clicking on DynamicControls lnk*/
    public DynamicControlsPage clickDynamicControls() {
        commons.click(dynamicControlsLnk);
        return new DynamicControlsPage(getDriver());
    }
}
