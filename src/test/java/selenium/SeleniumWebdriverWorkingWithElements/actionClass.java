package selenium.SeleniumWebdriverWorkingWithElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class actionClass {
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

    @AfterClass
    public void tearDown() {
        driver.close();
      //  driver.quit();
    }

    @Test
    public void dragDropEx1() {

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(drag,drop).perform();

        Assert.assertEquals("Dropped!",drop.getText());

    }

    @Test
    public void dragDropEx2() {

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));

        Action s = actions.clickAndHold(drag)
                .moveToElement(drop)
                .release()
                .build();

        s.perform();



        Assert.assertEquals("Dropped!",drop.getText());
    }

    @Test
    public void reSizable() {
        driver.navigate().to("https://jqueryui.com/resizable/");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName("demo-frame")));

       /* JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)", "");*/

        WebElement resizeHandle = driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
        actions.clickAndHold(resizeHandle).moveByOffset(250,150).perform();

        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='resizable' and @style]")).isDisplayed());

    }

}
