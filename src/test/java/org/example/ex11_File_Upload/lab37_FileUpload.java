package org.example.ex11_File_Upload;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class lab37_FileUpload extends CommonToAll {

    @Test
    public void test_fileUpload_p5() {
        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));

        String working_dir = System.getProperty("user.dir");
        // /Users/promode/IdeaProjects/LearnSeleniumATB11x


        String path_file = working_dir+"/src/test/java/org/example/Data.txt";

        uploadFileInput.sendKeys(path_file);
        driver.findElement(By.name("submit")).click();

    }
}
