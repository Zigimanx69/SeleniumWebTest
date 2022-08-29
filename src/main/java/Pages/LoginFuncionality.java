package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginFuncionality {

    private WebDriver driver;

    public LoginFuncionality(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFieldForUsername() {
        return this.driver.findElement(By.id("username"));
    }

    public WebElement getFiledForPassword() {
        return this.driver.findElement(By.id("password"));
    }

    public WebElement loginButton() {
        return this.driver.findElement(By.xpath("//i[contains(text(),' Login')]"));
    }

    public String getTextFromAlert() {
        return driver.findElement(By.id("flash")).getText();
    }

    public WebElement logOutButton() {
        return driver.findElement(By.xpath("//i[contains(text(),'Logout')]"));
    }

    public String getTextSignOut() {
        return driver.findElement(By.id("flash")).getText();
    }


}


