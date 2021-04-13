package com.company.browsertests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest implements BrowserTest {
    @Override
    public void startTest() {
        System.setProperty("webdriver.edge.driver", "D:\\Selenium\\drivers\\edgedriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://youtu.be/dQw4w9WgXcQ");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("The page title is : " +title);
    }
}
