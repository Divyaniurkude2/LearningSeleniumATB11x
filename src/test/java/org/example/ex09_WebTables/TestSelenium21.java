package org.example.ex09_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium21 {
    @Test
    @Description("Test Case Description")
    public void test_web_table_login() throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();


        // xpath ->  //table[@id="customers"]/tbody/tr[5]/td[2]


        //xpath - //table[@id="customers"]/tbody/tr[
        // i
        // ]/td[
        // j
        // ]

        String first_part = "//table[@id=\\\"customers\\\"]/tbody/tr[";
        String second_part ="]/td[";
        String third_part ="]";

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        for (int i = 2; i <= row ; i++) {
            for (int j = 1; j <=col ; j++) {
                String country_path = first_part+"/following-sibling::td";
                String country_text = driver.findElement(By.xpath(country_path)).getText();
                System.out.println("-------");
                System.out.println("Helen Bennet is In -" + country_text);

            }

        }
    }
}
