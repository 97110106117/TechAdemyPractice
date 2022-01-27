package internetHeroKuappPages.pages;

import internetHeroKuappPages.common.CommonFunctionalities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage extends CommonFunctionalities {

    CommonFunctionalities  commons;
    private  String forgetPasswordLnk = "https://the-internet.herokuapp.com/forgot_password";

    @FindBy(id="email")
    private WebElement emailLnk;

    @FindBy(tagName = "button")
    private WebElement retrievePasswordBtn;

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
        commons = new CommonFunctionalities(driver);
        PageFactory pageFactory = new PageFactory();
    }

    /** Wait for ForgotPassword field  to be visible  on the page*/
    public void waitForForgotPasswordPageToBeLoaded() {
        waitForVisibilityOf(retrievePasswordBtn,5);
    }

   /** Execute RetrievePassword */
   public EmailSentPage executeRetrievePassword(String email) {
       emailLnk.sendKeys(email);
       retrievePasswordBtn.click();
       return new EmailSentPage(getDriver());
   }

}
