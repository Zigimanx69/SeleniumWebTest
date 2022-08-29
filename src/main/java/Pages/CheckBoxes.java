package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxes {
    private WebDriver driver;

    public CheckBoxes(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement isCheckbox1() {
        return driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
    }

    public WebElement isCheckbox2() {
        return driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
    }

}
