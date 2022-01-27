package internetHeroKuappPages.pages;

import internetHeroKuappPages.common.CommonFunctionalities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonFunctionalities {

    CommonFunctionalities commons;

    private static String loginPageUrl = "https://the-internet.herokuapp.com/login";

     @FindBy(id="username")
     private WebElement userNameLnk;

    @FindBy(id="password")
    private WebElement passwordLnk;

    @FindBy(tagName="button")
    private WebElement loginButton;

    @FindBy(id = "flash")
    private WebElement errorMessageLnk;

    public LoginPage(WebDriver driver) {
        super(driver);
        commons = new CommonFunctionalities(driver);
    }

    /** open page using its url*/
    public void open() {
        commons.openUrl(loginPageUrl);
    }

    /** Wait for user field  to be visible  on the page*/
    public void waitForLoginPageToBeLoaded() {
        waitForVisibilityOf(userNameLnk,5);
    }

    /** Execute the Positive Login*/
    public SecureAreaPage login(String username , String password) {
        enterUsernameAndPassword(username,password);
        clickLoginButton();
        return new SecureAreaPage(getDriver());
    }

    /** click on login button*/
    private void clickLoginButton() {
        System.out.println("Clicking Login Button");
        click(loginButton);
    }

    /** Type given username and password */
    private void enterUsernameAndPassword(String username, String password) {
        System.out.println("Entering username and password");
        commons.writeText(userNameLnk,username);
        commons.writeText(passwordLnk,password);
    }

    /** Execute the Negative Login*/
    public void negativeLogin(String username , String password) {
        enterUsernameAndPassword(username,password);
        clickLoginButton();
        waitForErrorMessage();
    }

    /** wait for error message  to be visible  on the page*/
    public void waitForErrorMessage() {
        waitForVisibilityOf(errorMessageLnk,5);
    }

    public String getErrorMessageText() {
        return errorMessageLnk.getText();
    }




}
