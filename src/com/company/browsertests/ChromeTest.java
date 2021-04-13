package com.company.browsertests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest implements BrowserTest {
    @Override
    public void startTest() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://youtu.be/dQw4w9WgXcQ");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("The page title is : " +title);
    }
}
