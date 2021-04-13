package com.company.browsertests;

public class TestManager {
    private static TestManager instance;

    private  TestManager() {

    }

    public static TestManager getInstance(){
        if (instance == null) {
            instance = new TestManager();
        }
        return instance;
    }

    public void startSelectedTest(BrowserTest browserTest){
        browserTest.startTest();
    }
}
