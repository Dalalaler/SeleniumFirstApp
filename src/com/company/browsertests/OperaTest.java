package com.company.browsertests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaTest implements BrowserTest {
    @Override
    public void startTest() {
        System.setProperty("webdriver.opera.driver", "D:\\Selenium\\drivers\\operadriver\\operadriver.exe");
        WebDriver driver = new OperaDriver();
        driver.get("https://youtu.be/dQw4w9WgXcQ");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("The page title is : " +title);
    }
}
