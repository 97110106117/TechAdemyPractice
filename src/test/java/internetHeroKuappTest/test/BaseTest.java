package internetHeroKuappTest.test;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import selenium.masterSeleniumWebDriver.BrowserDriverFactory;


public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    @Parameter(names = {"browser", "environment"})
    protected void setUp(@Optional("chrome") String browser, @Optional("local") String environment) {
        BrowserDriverFactory factory = new BrowserDriverFactory("browser");

        if (environment.equals("grid")) {
            driver = factory.createDriverGrid();
        } else {
            driver = factory.createDriver();
        }

        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    protected void tearDown() {
        System.out.println("Closing driver");
        driver.quit();
    }
}
