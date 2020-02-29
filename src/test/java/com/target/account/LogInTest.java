package com.target.account;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

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
        Thread.sleep(6000);

    }

}
