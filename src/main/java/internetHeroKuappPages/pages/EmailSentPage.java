package internetHeroKuappPages.pages;

import internetHeroKuappPages.common.CommonFunctionalities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailSentPage  extends CommonFunctionalities {
    CommonFunctionalities  commons;
    @FindBy(id = "content")
    private WebElement messageLnk;

    public EmailSentPage(WebDriver driver) {
        super(driver);
        commons = new CommonFunctionalities(driver);
    }

    /** Wait for EmailSentPage field  to be visible  on the page*/
    public void waitForEmailSentPageToBeLoaded() {
        waitForVisibilityOf(messageLnk,5);
    }

    public String getMessageText() {
        return messageLnk.getText();
    }


}
