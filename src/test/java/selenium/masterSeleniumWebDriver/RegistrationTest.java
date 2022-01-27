package selenium.masterSeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest{

    @Test
    public void registrationTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
       String registerHeaderName = driver.findElement(By.xpath("//div/h5")).getText();
        System.out.println(registerHeaderName);

        WebElement firstName =driver.findElement(By.id("firstName"));
        WebElement lastName  = driver.findElement(By.id("lastName"));
        WebElement emailId = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
        WebElement gender = driver.findElement(By.xpath("//div[@class=\"custom-control custom-radio custom-control-inline\"]/input[@value='Female']"));
        WebElement mobile = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        WebElement submit= driver.findElement(By.cssSelector("button#submit"));

        WebDriverWait wait = new WebDriverWait(driver,10);

        firstName.sendKeys("nano");
        lastName.sendKeys("sing");
        emailId.sendKeys("abc@gmail.com");
        gender.click();
        wait.until(ExpectedConditions.visibilityOf(gender));
        Assert.assertTrue(gender.isSelected(),"Male checkbox is not selected");
        mobile.sendKeys("9876788343");
        Thread.sleep(3000);
        submit.click();
        Assert.assertTrue(submit.isSelected(),"submit button is not selected");



    }
}
