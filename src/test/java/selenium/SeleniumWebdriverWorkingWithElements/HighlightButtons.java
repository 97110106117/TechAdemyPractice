package selenium.SeleniumWebdriverWorkingWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HighlightButtons  extends BaseTest{

    //1
    @Test
    public void test() {
        HighLightElements(By.className("buttonClass"));
        HighLightElements(By.id("idExample"));
        HighLightElements(By.linkText("Click me using this link text!"));
        HighLightElements(By.name("button1"));
        HighLightElements(By.partialLinkText(" link text!"));
        HighLightElements(By.tagName("div"));
        HighLightElements(By.cssSelector("#idExample"));
        HighLightElements(By.cssSelector(".buttonClass"));
        HighLightElements(By.xpath("//*[@id='idExample']"));
        HighLightElements(By.xpath("//*[@class='buttonClass']"));
    }

    //2
    @Test
    public void singleElementWithDiffLocators() {
        HighLightElements(By.id("simpleElementsLink"));
        HighLightElements(By.tagName("a"));
        HighLightElements(By.className("et_pb_blurb_description"));
        HighLightElements(By.name("clickableLink"));
        HighLightElements(By.linkText("Click this link"));
        HighLightElements(By.partialLinkText("this link"));
        HighLightElements(By.cssSelector("#simpleElementsLink"));
        HighLightElements(By.xpath("//*[@id='simpleElementsLink']"));
    }

    //3
    @Test
    public void xpathExam() {
        clickElement("//div[text()='Click and validate that they are selected']/form/input[2]");
        clickElement("//div[text()='Select a checkbox and validate that they are selected']/form/input[1]");

        WebElement element = driver.findElement(By.tagName("select"));
        Select select = new Select(element);
         select.selectByValue("audi");

         clickElement("//a[text()='Tab 2']");
         driver.findElement(By.xpath("//*[text()='Tab 2 content']"));
         Assert.assertTrue(true,"Tab 2 content");

         HighLightElements(By.xpath("//*[@id=\"htmlTableId\"]/tbody/tr[4]/td[3]"));
         HighLightElements(By.xpath("//div[@class=\"et_pb_column et_pb_column_1_3 et_pb_column_10  et_pb_css_mix_blend_mode_passthrough\"]"));
    }

    //navigator 4
    @Test
    public void navigateTitles() {
        driver.get("https://ultimateqa.com/");
        String title = driver.getTitle();
        System.out.println("parent title : "+title);
        Assert.assertEquals("Home | Ultimate QA",title);

        driver.navigate().to("https://ultimateqa.com/automation/");
        String title1 = driver.getTitle();
        System.out.println("child title: "+title1);
        Assert.assertEquals("Automation Practice | Ultimate QA",title1);

        driver.findElement(By.xpath("//a[@href='../complicated-page']")).click();
        Assert.assertEquals("Complicated Page | Ultimate QA",driver.getTitle());

        driver.get("https://ultimateqa.com/complicated-page");
        String title3 = driver.getTitle();
        System.out.println("grandchild :" +title3);

        driver.navigate().back();
        Assert.assertEquals("Automation Practice | Ultimate QA",title1);
    }

    //5
    @Test
    public void fillOutBox() {
        driver.navigate().to("https://ultimateqa.com/filling-out-forms/");
        enterValue("//input[@id='et_pb_contact_name_1']","MockPractice.test");
        enterValue("//textarea[@id='et_pb_contact_message_1']","testing");
    }

    //6 this will not execute
    @Test
    public void elementInterrogation() {
        driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation/n/");
        WebElement element = driver.findElement(By.xpath("//div[@class='et_pb_text_inner']/form/button[text()='Click Me!']"));
       // WebElement element = driver.findElement(By.id("button1"));
        Assert.assertEquals("submit",element.getAttribute("type"));
        Assert.assertEquals("noraml",element.getCssValue("letter-spacing"));
        Assert.assertTrue(element.isDisplayed());
        Assert.assertTrue(element.isEnabled());
        Assert.assertFalse(element.isSelected());
        Assert.assertEquals("Click Me!",element.getText());
        Assert.assertEquals("button",element.getTagName());
        Assert.assertEquals(21,element.getSize().height);
        Assert.assertEquals(190,element.getLocation().x);
        Assert.assertEquals(330,element.getLocation().y);

    }
}
