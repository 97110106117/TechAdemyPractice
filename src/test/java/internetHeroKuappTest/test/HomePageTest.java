package internetHeroKuappTest.test;

import internetHeroKuappPages.common.CommonFunctionalities;
import internetHeroKuappPages.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class HomePageTest extends CommonFunctionalities {

    CommonFunctionalities commons;
    HomePage homePage;

    public HomePageTest(WebDriver driver) {
        super(driver);
        commons = new CommonFunctionalities(getDriver());
    }
    
    public void initObjects() {
        homePage = new HomePage(getDriver());
    }



}
