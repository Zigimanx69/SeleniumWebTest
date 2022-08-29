package Test;

import org.testng.annotations.Test;

public class DoomTest extends BasicTest {

    @Test(priority = 1)
    public void checkContentOfRows() {
        driver.get(baseUrl + "/challenging_dom");
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("/challenging_dom")) {
            System.out.println("Url contain /challenging_dom");
        } else {
            System.out.println("Url those not match");
        }
        if (challengingDOM.checkDoomElementLorem().contains("Iuvaret6")) {
            System.out.println("Text is " + challengingDOM.checkDoomElementLorem());
        } else {
            System.out.println("Text is not matching");
        }
        if (challengingDOM.checkDoomElementIpsum().contains("Apeirian6")) {
            System.out.println("Text is Apeirian6");
        } else {
            System.out.println("Text is not matching");
        }
        if (challengingDOM.checkDoomElementDolor().contains("Adipisci6")) {
            System.out.println("Text is Adipisci6");
        } else {
            System.out.println("Text is not matching");
        }
        if (challengingDOM.checkDoomElementSit().contains("Definiebas6")) {
            System.out.println("Text is Definiebas6");
        } else {
            System.out.println("Text is not matching");
        }
        if (challengingDOM.checkDoomElementAmet().contains("Consequuntur6")) {
            System.out.println("Text is Consequuntur6");
        } else {
            System.out.println("Text is not matching");
        }
        if (challengingDOM.checkDoomElementDiceret().contains("Phaedrum6")) {
            System.out.println("Text is Phaedrum6");
        } else {
            System.out.println("Text is not matching");
        }

    }
}
