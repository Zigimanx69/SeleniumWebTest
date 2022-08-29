package Test;


import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BasicTest {

    protected LoginFuncionality loginFuncionality;
    protected CheckBoxes checkBoxes;
    protected ChallengingDOM challengingDOM;
    protected String baseUrl = "https://the-internet.herokuapp.com";

    protected WebDriver driver = new ChromeDriver();
    protected Actions action = new Actions(driver);
    protected DragAndDrop dragAndDrop;

    protected String fileDownloadpath = "C:\\Users\\zigim\\Downloads";

    protected FileDownloadAndValidation fileDownloadAndValidation;

    protected Iframe iframe;


    @BeforeClass
    public void beforeClass() {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver.get(baseUrl);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        loginFuncionality = new LoginFuncionality(driver);
        challengingDOM = new ChallengingDOM(driver);
        checkBoxes = new CheckBoxes(driver);
        dragAndDrop = new DragAndDrop(driver);
        iframe = new Iframe(driver);
        fileDownloadAndValidation = new FileDownloadAndValidation(driver);


    }

    @BeforeClass
    public void beforeMethod() {
        this.driver.get(baseUrl);
    }

    @AfterTest
    public void afterClass() {
        this.driver.quit();
    }
}

