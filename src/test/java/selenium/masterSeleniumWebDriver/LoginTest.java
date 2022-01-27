package selenium.masterSeleniumWebDriver;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        System.out.println("Page Opened");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.tagName("button")).click();

        String message = driver.findElement(By.id("flash-messages")).getText();
        Thread.sleep(3000);
        Assert.assertTrue(message.contains("You logged into a secure area!"));
    }

}
