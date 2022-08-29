package Test;

import org.testng.annotations.Test;

public class CheckBoxTest extends BasicTest{


    @Test(priority = 1)
    public void checkBoxSelectedOrNot(){
        driver.get(baseUrl + "/checkboxes");
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("/checkboxes")) {
            System.out.println("Url contain /checkboxes");
        } else {
            System.out.println("Url those not match");
        }
        boolean isSelected = checkBoxes.isCheckbox1().isSelected();
        if(isSelected == true){
            System.out.println("CheckBox is selected");
        }else{
            System.out.println("CheckBox is not selected");
        }
        boolean isSelected1 = checkBoxes.isCheckbox2().isSelected();
        if(isSelected1 == true){
            System.out.println("CheckBox is selected");
        }else{
            System.out.println("CheckBox is not selected");
        }

    }
    @Test(priority = 2)
    public void checkFirstCheckbox(){
        driver.get(baseUrl + "/checkboxes");
        checkBoxes.isCheckbox1().click();
        boolean isSelected = checkBoxes.isCheckbox1().isSelected();
        if(isSelected == true){
            System.out.println("CheckBox is selected");
        }else{
            System.out.println("CheckBox is not selected");
        }
    }

    @Test(priority = 3)
    public void checkSecondCheckbox(){
        driver.get(baseUrl + "/checkboxes");
        checkBoxes.isCheckbox2().click();
        boolean isSelected = checkBoxes.isCheckbox2().isSelected();
        if(isSelected == true){
            System.out.println("CheckBox is selected");
        }else{
            System.out.println("CheckBox is not selected");
        }
    }
}
