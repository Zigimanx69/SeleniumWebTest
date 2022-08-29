package Test;

import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

public class DragAndDropTest extends BasicTest {

    @Test(priority = 1)
    public void dragAndDropTest() {
        driver.get(baseUrl + "/drag_and_drop");
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("/drag_and_drop")) {
            System.out.println("Url contain /drag_and_drop");
        } else {
            System.out.println("Url those not match");
        }
        Action Action = action.clickAndHold(dragAndDrop.moveDragandDropA())
                .moveToElement(dragAndDrop.moveDragAndDropB())
                .release(dragAndDrop.moveDragAndDropB())
                .build();
        if (dragAndDrop.validationDragAndDropFirst().contains("B")) {
            System.out.println("First square is B");
        } else {
            System.out.println("First square is not B");
        }
        if (dragAndDrop.validationDragAndDropSecound().contains("A")) {
            System.out.println("First square is A");
        } else {
            System.out.println("First square is not A");
        }
    }
}
