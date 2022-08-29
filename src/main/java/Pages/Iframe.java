package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframe {

    private WebDriver driver;

    public Iframe(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement clickFileElement() {
        return driver.findElement(By.xpath("//span[contains(text(),'File')]"));
    }

    public WebElement clikNewDeocument() {
        return driver.findElement(By.xpath("//div[contains(text(),'New document')]"));
    }

    public WebElement iframeSwitchto() {
        return driver.findElement(By.id("mce_0_ifr"));
    }

    public WebElement checkiframeTextFiled() {
        return driver.findElement(By.id("tinymce"));
    }

    public WebElement formatField() {
        return driver.findElement(By.xpath("//span[contains(text(),'Format')]"));
    }

    public WebElement blocksFiled() {
        return driver.findElement(By.xpath("//div[contains(text(),'Blocks')]"));
    }

    public WebElement heading3() {
        return driver.findElement(By.xpath("//h3[contains(text(),'Heading 3')]"));
    }

    public String validationH3Element() {
        return driver.findElement(By.xpath("//div[contains(text(),'h3')]")).getText();
    }

    public WebElement bold() {
        return driver.findElement(By.xpath("//div[contains(text(),'Bold')]"));
    }

    public String validationP() {
        return driver.findElement(By.xpath("//div[contains(text(),'p')]")).getText();
    }

    public String validationArrow() {
        return driver.findElement(By.xpath("//div[contains(text(),' » ')]")).getText();
    }

    public String validationStrong() {
        return driver.findElement(By.xpath("//div[contains(text(),'strong')]")).getText();
    }

    public WebElement align() {
        return driver.findElement(By.xpath(" //div[contains(text(),'Align')]"));
    }

    public WebElement alignCenter() {
        return driver.findElement(By.xpath("//div[contains(text(),'Center')]"));
    }

    public String checkifTextIsCenter1() {
        return driver.findElement(By.xpath("//body[@id = 'tinymce']/h3[1]")).getAttribute("style");
    }

    public String checkifTextIsCenter2() {
        return driver.findElement(By.xpath("//body[@id = 'tinymce']/h3[2]")).getAttribute("style");
    }


}
