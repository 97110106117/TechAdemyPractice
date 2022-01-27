package Test;

import com.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePageTest {

    WebDriver driver;
    HomePage homePage;
    @Test
    public void verifyFormAuthenticationVisible() {
        homePage = new HomePage(driver);
        homePage.isFormAuthenticationVisible();
        //need to save commited changes on local repository

    }

}
