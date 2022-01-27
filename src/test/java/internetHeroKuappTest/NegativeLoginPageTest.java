package internetHeroKuappTest;

import internetHeroKuappPages.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pageObject.test.BaseTest;

public class NegativeLoginPageTest extends BaseTest {

    @Test(priority = 1)
    public void IncorrectUsernameTest() {
        //open Login page directly
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();

        //Execute negative login
        loginPage.negativeLogin("IncorrectUsername", "SuperSecretPassword");

        //wait for errorMessage
        loginPage.waitForErrorMessage();
        String messageText = loginPage.getErrorMessageText();
        System.out.println("Result:  " + messageText);

        Assert.assertTrue(messageText.contains("You username is invalid!"),"Message");
    }

    @Test(priority = 2)
    public void IncorrectPasswordTest() {
        //open Login page directly
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();

        //Execute negative login
        loginPage.negativeLogin("", "IncorrectPassword");

        //wait for errorMessage
        loginPage.waitForErrorMessage();
        String messageText = loginPage.getErrorMessageText();
        System.out.println("Result:  " + messageText);

        Assert.assertTrue(messageText.contains("You password is invalid!"),"Message");
    }
}
