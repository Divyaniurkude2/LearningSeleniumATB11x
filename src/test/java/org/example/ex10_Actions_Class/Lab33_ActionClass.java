package org.example.ex10_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab33_ActionClass {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        String URL = "https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.xpath("//div[@data-testid=\\\"to-testID-origin\\\"]/div/div/input"));

        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().sendKeys("BLR").build().perform();
    }
}
