package Test;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class IframeTest extends BasicTest{

    @Test(priority = 1)
    public void openCheckAndClick() throws InterruptedException {
        driver.get(baseUrl + "/iframe");
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("/iframe")) {
            System.out.println("Url contain /iframe");
        } else {
            System.out.println("Url those not match");
        }
        iframe.clickFileElement().click();
        iframe.clikNewDeocument().click();
        driver.switchTo().frame(iframe.iframeSwitchto());
        String emptyString = iframe.checkiframeTextFiled().getText();
        if(emptyString.isBlank()){
            System.out.println("Input field is empty");
        }else{
            System.out.println("Field was not empty");
        }

    }

    @Test(priority = 2)
    public void inputTextInField() throws InterruptedException {
        driver.get(baseUrl + "/iframe");
        iframe.clickFileElement().click();
        iframe.clikNewDeocument().click();
        driver.switchTo().frame(iframe.iframeSwitchto());
        iframe.checkiframeTextFiled().sendKeys("iFrame Test");
        action.keyDown(Keys.SHIFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                keyUp(Keys.SHIFT).perform();
        driver.switchTo().defaultContent();
        iframe.formatField().click();
        iframe.blocksFiled().click();
        iframe.heading3().click();
        String validation = iframe.validationH3Element();
        if(validation.equals("H3")){
            System.out.println("H3 element is present");
        }else{
            System.out.println("H3 element is not present!!");
        }
        driver.switchTo().frame(iframe.iframeSwitchto());
        action.sendKeys(Keys.ENTER).perform();
        iframe.checkiframeTextFiled().sendKeys("Paragraph text");
        action.keyDown(Keys.SHIFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).
                keyUp(Keys.SHIFT).perform();
        driver.switchTo().defaultContent();
        iframe.formatField().click();
        iframe.bold().click();
        String validationP = iframe.validationP();
        String validationArrow = iframe.validationArrow();
        String validationStrong = iframe.validationStrong();
        if(validationP.equals("P") && validationArrow.equals("»")  && validationStrong.equals("STRONG")){
            System.out.println("Validation of expected string are corect");
        }else{
            System.out.println("Validation not expected " + validationP  + "," + validationArrow + "," + validationStrong);
        }

        driver.switchTo().frame(iframe.iframeSwitchto());
        iframe.checkiframeTextFiled().sendKeys(Keys.CONTROL+"a");
        driver.switchTo().defaultContent();
        iframe.formatField().click();
        iframe.align().click();
        iframe.alignCenter().click();
        driver.switchTo().frame(iframe.iframeSwitchto());
        String centerText = iframe.checkifTextIsCenter1();
        if(centerText.equalsIgnoreCase("text-align: center;")){
            System.out.println("First text is center");
        }else{
            System.out.println("First text is not centered");
        }

        String centerText2 = iframe.checkifTextIsCenter2();
        if(centerText2.equalsIgnoreCase("text-align: center;")){
            System.out.println("Second text is center");
        }else{
            System.out.println("Second text is not centered");
        }

    }


}
