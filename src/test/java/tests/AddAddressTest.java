package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AddressPage;

public class AddAddressTest extends BaseTest {
    LogInTest logIn;

    //@Test
    public void addaddress() throws InterruptedException {

            logIn.loginTest();
            driver.get("https://www.boxed.com/account/address");
            AddressPage address = new AddressPage(driver);
            address.clickAddAddress();
            Thread.sleep(3000);
            address.setFirst_name("Asad");
            address.setLast_name("Zamzam");
            address.setAddress("123 Frank ave");
            address.setCity("Buffalo");
            address.selectDropDownState("NY");
            address.setPostal("14212");
            address.clickSaveButton();
            Thread.sleep(2000);
    }

    //@Test
    public void delete_Address() throws InterruptedException {
        logIn.loginTest();
        driver.get("https://www.boxed.com/account/address");
        AddressPage address = new AddressPage(driver);
        address.clickRemove();
        address.deleteAddress();
    }

}

