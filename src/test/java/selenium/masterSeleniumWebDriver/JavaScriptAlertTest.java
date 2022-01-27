package selenium.masterSeleniumWebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptAlertTest extends BaseTest{

    @Test
    public void javaScriptAlertTest() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println("open");

        WebElement element = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        element.click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());
         Alert alert =driver.switchTo().alert();
         alert.accept();

         String Excepted = "You successfully clicked an alert";
         String actual = driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']")).getText();
        System.out.println(actual);
        Assert.assertEquals(actual,Excepted);


        WebElement element1 = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        String  actualValue  = driver.findElement(By.id("result")).getText();
        String expectedValue = "You clicked: Ok";
        Assert.assertEquals(actualValue,expectedValue,"result not displayed");

        WebElement element2 = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("hello world");
    }
}
