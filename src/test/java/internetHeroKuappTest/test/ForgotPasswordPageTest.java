package internetHeroKuappTest.test;

import internetHeroKuappPages.pages.EmailSentPage;
import internetHeroKuappPages.pages.ForgotPasswordPage;
import internetHeroKuappPages.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pageObject.test.BaseTest;

public class ForgotPasswordPageTest extends BaseTest {
    HomePage homePage;
    @Test(priority = 1)
    public void LoginTest() {
        //open Home page
        homePage = new HomePage(getDriver());
        homePage.open();

        //Click Forgot Password Link
        ForgotPasswordPage forgotPassword = homePage.clickForgotPassword();
        forgotPassword.waitForForgotPasswordPageToBeLoaded();

        //retrieve Password
        EmailSentPage emailSentPage = forgotPassword.executeRetrievePassword("us@gmail.com");

        //wait for success message
        emailSentPage.waitForEmailSentPageToBeLoaded();
        String message = emailSentPage.getMessageText();
        System.out.println("result :" +message);

        Assert.assertTrue(message.contains("Your e-mail's been sent!"),"Message does not contains expected text");



    }
}
