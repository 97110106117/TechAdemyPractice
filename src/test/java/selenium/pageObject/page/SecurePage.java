package selenium.pageObject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecurePage extends BasePageObject {

    By logoutButtonLocator = By.xpath("//a[@class='button secondary radius']");

    public SecurePage(WebDriver driver) {
        super(driver);
    }

    public void waitForSecurePage(long millis) {
        System.out.println("waiting for secure page");
        WebDriverWait wait = new WebDriverWait(driver,millis);
        wait.until(ExpectedConditions.presenceOfElementLocated(logoutButtonLocator));
    }

    public boolean isLoginButtonVisible() {
       // return find(logoutButtonLocator).isDisplayed();
        return false;
    }
}
