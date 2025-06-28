package org.example.ex06_Input_Select_Alerts_Radio_CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium26_Input_Checkbox_Radio {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        //Input
        driver.findElement(By.name("firstname")).sendKeys("the testing academy");

        //RADIO Box
        driver.findElement(By.id("sex-1")).click();

        //CheckBox
        driver.findElement(By.id("tool-1")).click();
    }
}
