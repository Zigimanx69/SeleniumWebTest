package Test;

import org.testng.annotations.Test;

public class LoginTest extends BasicTest {

    @Test(priority = 1)
    public void loginAuthentication() {
        driver.get(baseUrl + "/login");
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("/login")) {
            System.out.println("Url contain /login");
        } else {
            System.out.println("Url those not match");
        }
        loginFuncionality.getFieldForUsername().sendKeys("tomsmith");
        loginFuncionality.getFiledForPassword().sendKeys("SuperSecretPassword!");
        loginFuncionality.loginButton().click();
        if (loginFuncionality.getTextFromAlert().contains("You logged into a secure area!")) {
            System.out.println("Text are present");
        } else {
            System.out.println("Text are not there");
        }
        loginFuncionality.logOutButton().click();
        if (loginFuncionality.getTextSignOut().contains("You logged out of the secure area!")) {
            System.out.println("Text are same");
        } else {
            System.out.println("Text are not same");
        }
        driver.get(baseUrl + "/login");
        loginFuncionality.getFieldForUsername().sendKeys("tomsmith1");
        loginFuncionality.getFiledForPassword().sendKeys("SuperSecretPassword!");
        loginFuncionality.loginButton().click();
        if (loginFuncionality.getTextFromAlert().contains("Your username is invalid!")) {
            System.out.println("Username is invalid");
        } else {
            System.out.println("Username is ok you are logged");
        }
        driver.get(baseUrl + "/login");
        loginFuncionality.getFieldForUsername().sendKeys("tomsmith");
        loginFuncionality.getFiledForPassword().sendKeys("SuperSecretPassword!1");
        loginFuncionality.loginButton().click();
        if (loginFuncionality.getTextFromAlert().contains("Your password is invalid!")) {
            System.out.println("Paswword is invalid");
        } else {
            System.out.println("Paswword is ok you are logged");
        }


    }

}
