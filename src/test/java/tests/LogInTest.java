package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import com.boxed.accounts.pages.*;
import pages.HomePage;
import pages.LogInPage;

public class LogInTest extends BaseTest{

    @Test
    public void loginTest() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.clickLogin();
        LogInPage login = new LogInPage(driver);
        login.enterEmail("asadinusa@gmail.com");
        login.enterPassword("Myfamily01");
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
        driver.findElementByXPath("//*[@id='address-list-v2']/ul/li[1]/div[1]/div[3]/a").click();
        Thread.sleep(5000);
        driver.findElementByXPath("//*[@id='modal-newa']/div[2]/div/div/div[1]/div/div[1]/button").click();


    }

}
