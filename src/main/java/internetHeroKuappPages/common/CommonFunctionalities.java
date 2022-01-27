package internetHeroKuappPages.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctionalities {

    private static WebDriver driver;

    public void openUrl(String url) {
        WebDriverManager.chromedriver().setup();
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println("Page opened!");

    }

    private void waitFor(ExpectedCondition<WebElement> visibilityOf ,Integer timeOutInSeconds) {
        timeOutInSeconds = timeOutInSeconds != null ? timeOutInSeconds : 30;
        WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
        wait.until(visibilityOf);
    }

    protected  void waitForVisibilityOf(WebElement element ,Integer... timeOutSeconds) {
        int attempts = 0;
        while (attempts<2) {
            try {
                 waitFor(ExpectedConditions.visibilityOf(element),
                         (timeOutSeconds.length>0 ? timeOutSeconds[0] : null));
                 break;
            } catch (StaleElementReferenceException e) {
            }
            attempts ++;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void tearDown() {
        driver.quit();
    }

    public CommonFunctionalities(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void click(WebElement element) {
        element.click();
    }

    public void writeText(WebElement element, String value) {
        element.sendKeys(value);
    }


}
