package selenium.SeleniumWebdriverWorkingWithElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitClass {
    private WebDriver driver;
    private String URL1 = "https://the-internet.herokuapp.com/dynamic_loading/1";
    private String URL2 = "https://the-internet.herokuapp.com/dynamic_loading/2";

    private By elementId = By.id("finish");

    @BeforeClass
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void DynamicallyLoadingElementsTestFailure_Fixed() {
        tryFind();
    }

    private void tryFind() {
        driver.navigate().to(URL1);
        driver.findElement(By.tagName("button")).click();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementId));

        WebElement text  = driver.findElement(By.xpath(".//*[contains(text(),'Hello World!')]"));
        text.click();
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
