package selenium.SeleniumWebdriverWorkingWithElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NetworkTab {
    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/droppable/");
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void openNetworkTabUsingFireFox() {
        driver.navigate().to("https://www.google.com/");
        actions.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("q").perform();

        actions.keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).perform();
        driver.navigate().to("https://www.pureexample.com/jquery-ui/basic-droppable.html");
    }

    @Test
    public void notSupportBySelenium() {
        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("column-a")));

       // WebElement jsFile = File.createTempFile("C:\\Users\\umanjalis\\Downloads\\2362544-da3f37f412119d7f2bc204529c27bfca3441965c\\2362544-da3f37f412119d7f2bc204529c27bfca3441965c");

    }
}
