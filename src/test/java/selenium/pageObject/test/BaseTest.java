package selenium.pageObject.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    protected void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod(alwaysRun = true)
    protected void tearDown() {
        System.out.println("close browser");
        driver.close();
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

}
