package selenium.pageObject.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import selenium.pageObject.page.LoginPage;
import selenium.pageObject.page.SecurePage;

public class FirstTest extends BaseTest {
    LoginPage loginPage;
    SecurePage securePage;
    SoftAssert softAssert;

    @Test
    public void firstTest() {
        loginPage = new LoginPage(getDriver());
        loginPage.open();

        //clicking login button
        securePage = loginPage.login();
        securePage.waitForSecurePage(10000);

        //Verification
        softAssert = new SoftAssert();
        softAssert.assertTrue(securePage.isLoginButtonVisible(),"Login button is not displayed.");
        softAssert.assertTrue(securePage.getPageSource().contains(" logged into a secure area!")," ");

        softAssert.assertAll();// if we dnt write assertAll() - test will pass even assertion fail



    }

}
