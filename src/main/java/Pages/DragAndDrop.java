package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragAndDrop {

    private WebDriver driver;

    public DragAndDrop(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement moveDragandDropA() {
        return driver.findElement(By.id("column-a"));
    }

    public WebElement moveDragAndDropB() {
        return driver.findElement(By.id("column-b"));
    }

    public String validationDragAndDropFirst() {
        return driver.findElement(By.xpath("//div[1]/header[contains(text(),'B')]")).getText();
    }

    public String validationDragAndDropSecound() {
        return driver.findElement(By.xpath("//div[2]/header[contains(text(),'A')]")).getText();
    }

}
