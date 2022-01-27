package internetHeroKuappPages.pages;

import internetHeroKuappPages.common.CommonFunctionalities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureAreaPage  extends CommonFunctionalities {

    CommonFunctionalities commons;

    @FindBy(id = "flash-messages")
    private WebElement messageLnk;

    public SecureAreaPage(WebDriver driver) {
        super(driver);
        commons = new CommonFunctionalities(driver);
    }

    /** wait for message to be visible on the page*/
    public void waitForSecureAreaPageToBeLoaded() {
        waitForVisibilityOf(messageLnk,5);
    }

    public String getMessageText() {
        return messageLnk.getText();
    }
}
