package org.example.ex16_Selenium_Exceptions;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab46_Exception_Selenium_TimeOut extends CommonToAll {

    @Test
    public void test_selenium_exception() {
        System.out.println("Start of program");
        driver.get("https://google.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // ✅ Correct locator for the Google search box
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='APjFqb']")));

        WebElement search_inputbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search_inputbox.sendKeys("the testing academy");
    }
}
