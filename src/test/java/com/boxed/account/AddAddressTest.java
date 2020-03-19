package com.boxed.account;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class AddAddressTest extends BaseTest {
    LogInTest logInTest;

    //@Test
    public void addaddress() throws InterruptedException {
            logInTest.loginTest();
            driver.get("https://www.boxed.com/account/address");
            driver.findElementByXPath("//*[@id='address-list-v2']//button").click();
            Thread.sleep(3000);
            driver.findElementByXPath("//input[@name='firstName']").sendKeys("Asad");
            driver.findElementByXPath("//input[@name='lastName']").sendKeys("Zaman");
            driver.findElementById("addressLine1").sendKeys("131 Francis Ave");
            driver.findElementById("city").sendKeys("Buffalo");
            Select state = new Select(driver.findElementById("state"));
            state.selectByValue("NY");
            driver.findElementById("postalCode").sendKeys("14212", Keys.RETURN);
            Thread.sleep(2000);
    }

    //@Test
    public void deleteAddtress() throws InterruptedException {
        LogInTest logInTest = new LogInTest();
        logInTest.loginTest();
    }

}

