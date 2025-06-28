package org.example.ex05_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;

public class TestSelenium22_Waits {
    @Description("Verify eBay prints the prices of iMac")
    @Test
    public void test_verify_print_imac_price() {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://app.vwo.com");

        driver.quit(); // Always close the driver
    }
}
