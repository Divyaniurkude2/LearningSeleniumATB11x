package org.example.ex06_Input_Select_Alerts_Radio_CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelenium27_Select_Static {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement element_select = driver.findElement(By.id("dropdown"));
        Select select = new Select(element_select);
//        select.selectByIndex(1);
//        select.selectByVisibleText("Option 1");
        select.selectByValue("2");
    }
}
