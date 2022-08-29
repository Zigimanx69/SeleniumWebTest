package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileDownloadAndValidation {
    private WebDriver driver;

    public FileDownloadAndValidation(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement iframeSwitchto() {
        return driver.findElement(By.id("mce_0_ifr"));
    }

    public WebElement pickTextDownload() {
        return driver.findElement(By.xpath("//a[contains(text(),'some-file.txt')]"));
    }

}
