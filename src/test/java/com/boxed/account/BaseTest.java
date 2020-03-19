package com.boxed.account;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public ChromeDriver driver;

    @Before
    public void beforeTest()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver-80");
        //System.setProperty("webdriver.chrome.driver","/Users/zubair/Downloads/chromedriver-80");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-agent=Boxed-Automation-46241e82dafd3707");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("http://www.boxed.com/login");
    }

    @After
    public void quitBrowser()
    {
        driver.quit();
    }
}
