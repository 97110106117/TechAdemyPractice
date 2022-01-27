package selenium.SeleniumWebdriverWorkingWithElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    protected void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
    }

    @AfterMethod(alwaysRun = true)
    protected void tearDown() {
        System.out.println("close browser");
        driver.close();
        driver.quit();
    }


    protected void HighLightElements(By locators) {
        WebElement element= driver.findElement(locators);

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].setAttribute(arguments[1],arguments[2]);",
                element,
                "style",
                "border: 7px solid red; border-style: dashed;");
    }
    protected void clickElement(String locator) {
        WebElement element = driver.findElement(By.xpath(locator));
        element.click();
    }

    protected void getTitle(String title) {
        driver.getTitle();
    }


    protected void enterValue(String locator,String value) {
        WebElement element = driver.findElement(By.xpath(locator));
        element.clear();
        element.sendKeys(value);
    }
}
