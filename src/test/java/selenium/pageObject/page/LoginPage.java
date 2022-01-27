package selenium.pageObject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePageObject {

    private  String loginPageUrl = "https://the-internet.herokuapp.com/login";

    private  String username = "tomsmith";
    private String password = "SuperSecretPassword!";

    By usernameLocator = By.id("username");
    By passwordLocator = By.cssSelector("input[name='password']");
    By loginButtonLocator = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public SecurePage login() {
        System.out.println("Entering username and password");
        find(usernameLocator).sendKeys(username);
        find(passwordLocator).sendKeys(password);

        System.out.println("Clicking Login button");
        find(loginButtonLocator).click();

        return new SecurePage(driver);
    }
    public void open() {
        openUrl(loginPageUrl);

    }
}
