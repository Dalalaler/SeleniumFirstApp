package com.company;

import com.company.browsertests.*;

public class Main {
    public static void main(String[] args) {
        FirefoxTest firefoxTest = new FirefoxTest();
        ChromeTest chromeTest = new ChromeTest();
        OperaTest operaTest = new OperaTest();
        EdgeTest edgeTest = new EdgeTest();

        TestManager.getInstance().startSelectedTest(firefoxTest);
        TestManager.getInstance().startSelectedTest(chromeTest);
        TestManager.getInstance().startSelectedTest(operaTest);
        TestManager.getInstance().startSelectedTest(edgeTest);
    }
}
