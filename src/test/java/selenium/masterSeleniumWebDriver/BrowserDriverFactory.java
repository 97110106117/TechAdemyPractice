package selenium.masterSeleniumWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserDriverFactory  extends  BaseTest{

    private final String browser;
    private final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public BrowserDriverFactory(String browser) {
        this.browser = browser.toLowerCase();
    }
    public WebDriver createDriver() {
        System.out.println("[Setting up driver : "+browser + "]");

        //creating browser
        switch (browser) {
            case "chrome" :
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());
                break;
            case "ff":
                WebDriverManager.firefoxdriver().setup();
                driver.set(new FirefoxDriver());
                break;
            case "ie" :
                WebDriverManager.iedriver().setup();
                driver.set(new InternetExplorerDriver());
                break;
            default:
                System.out.println("[ Couldn't set:  "+browser);
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());
                break;
        }
        return driver.get();
    }

    /** Starting  tests using selenium grid*/
    public WebDriver createDriverGrid() {
    //setting up selenium grid hub url
        URL url = null;
        try {
            url = new URL("");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        System.out.println("starting " +browser + "on grid");
        //using desiredCapabilities to set up browser
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);

        //create driver
        try {
            driver.set(new RemoteWebDriver(url,capabilities));
        } catch (WebDriverException e) {
            if (e.getMessage().contains("Error forwards")) {
                System.out.println("[couldn't set: "+browser+".Its unknown. By default chrome is used");
                capabilities.setBrowserName(browser);
                driver.set(new RemoteWebDriver(url,capabilities));

            }
        }
        return driver.get();
    }
}
