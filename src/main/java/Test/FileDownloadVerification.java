package Test;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDownloadVerification extends BasicTest {

    @Test(priority = 1)
    public void veificationAndDownload() throws InterruptedException {
        driver.get(baseUrl + "/download");
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("/download")) {
            System.out.println("Url contain /download");
        } else {
            System.out.println("Url those not match");
        }
        fileDownloadAndValidation.pickTextDownload().click();
        Thread.sleep(2000);
        File f = new File("C:\\Users\\zigim\\Downloads\\some-file.txt");
        f.exists();
        try {
            File file1 = new File("C:\\Users\\zigim\\Downloads\\some-file.txt");
            FileReader fr = new FileReader(file1);
            char[] data = new char[(int) file1.length()];
            fr.read(data);
            System.out.println(data);
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("C:\\Users\\zigim\\Downloads\\some-file.txt");
        if (file.delete())
            System.out.println("file deleted");


    }


}
