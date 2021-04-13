package com.company.browsertests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest implements BrowserTest {
    @Override
    public void startTest() {
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\drivers\\firefoxdriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://youtu.be/dQw4w9WgXcQ");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("The page title is : " +title);
    }
}
