package com.target.account;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAddressTest extends BaseTest {
    LogInTest logInTest;

    @Test
    public void addaddress() throws InterruptedException {
        LogInTest logInTest = new LogInTest();
        logInTest.loginTest();
    }

    @Test
    public void deleteAddtress() throws InterruptedException {
        LogInTest logInTest = new LogInTest();
        logInTest.loginTest();
    }

}

