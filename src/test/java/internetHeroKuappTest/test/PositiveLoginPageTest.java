package internetHeroKuappTest.test;

import internetHeroKuappPages.pages.HomePage;
import internetHeroKuappPages.pages.LoginPage;
import internetHeroKuappPages.pages.SecureAreaPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.pageObject.test.BaseTest;


public class PositiveLoginPageTest extends BaseTest {

      HomePage homePage;
      LoginPage loginPage;
      SecureAreaPage secureAreaPage;

    @Test(priority = 1)
    public void LoginInTest() {
        //open Home Page
        homePage = new HomePage(getDriver());
        loginPage = new LoginPage(getDriver());
        secureAreaPage = new SecureAreaPage(getDriver());

        homePage.open();

        //Click Login Link (Form Authentication)
        LoginPage loginPage = homePage.clickLogin();

        //wait for login page to be load
        loginPage.waitForLoginPageToBeLoaded();

        //Execute positive login
        SecureAreaPage secureAreaPage = loginPage.login("tomsmith","SuperSecretPassword");

        //wait for secureAreaPage  to be load
        secureAreaPage.waitForSecureAreaPageToBeLoaded();
        String messageText = secureAreaPage.getMessageText();
        System.out.println("Result:  "+ messageText);

        Assert.assertTrue(messageText.contains("You logged into a secure area!"));
    }
}
