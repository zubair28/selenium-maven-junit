package com.target.account;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LogInTest extends BaseTest{

    @Test
    public void loginTest() throws InterruptedException {
        driver.findElement(By.xpath("//section[@id='account-login']//input[@name='email']")).sendKeys("asadinusa@gmail.com");
        driver.findElement(By.xpath("//section[@id='account-login']//input[@name='password']")).sendKeys("Myfamily01");
        driver.findElement(By.xpath("//form//button[text()='LOG IN']")).click();
        Thread.sleep(5000);
    }

    @Test
    public void addAddressTest() throws InterruptedException {
        loginTest();
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

    @Test
    public void removeAddressTest() throws InterruptedException {
        loginTest();
        driver.get("https://www.boxed.com/account/address");
        driver.findElementByXPath("//*[text() = 'Remove']").click();
        Thread.sleep(5000);

    }

}
