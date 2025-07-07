package org.example.ex16_Selenium_Exceptions;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Lab45_Selenium_Exceptions_StaleElement extends CommonToAll {

    @Test
    public void text_selenium_exxceptions() {

        driver.get("https://google.com");
        System.out.println("Start of program");

        WebElement search_input_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

        System.out.println(driver.getWindowHandle());

        driver.navigate().refresh();

        try{
            search_input_box.sendKeys("the testing academy" + Keys.ENTER);
        }catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException");
        }

        System.out.println(driver.getWindowHandle());
        System.out.println("End of Program");
    }
}
