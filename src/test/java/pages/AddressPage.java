package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id='address-list-v2']//button")
    WebElement add_address_button;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement first_name;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement last_name;

    @FindBy(id = "addressLine1")
    WebElement address1;

    @FindBy(id = "city")
    WebElement city1;

    @FindBy(id = "state")
    WebElement state1;

    @FindBy(id = "postalCode")
    WebElement zip;

    @FindBy(xpath = "//*[@id='address-form-v2']/form/div[3]/button")
    WebElement save_button;

    @FindBy(xpath = "//*[@id='address-list-v2']/ul/li[1]/div[1]/div[3]/a")
    WebElement remove_button;

    @FindBy(xpath = "//*[@id='modal-newa']/div[2]/div/div/div[1]/div/div[1]/button")
    WebElement delete;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickAddAddress() {
        add_address_button.click();
    }
    public void setFirst_name(String firstName) {
        first_name.sendKeys(firstName);
    }
    public void setLast_name(String lastName) {
        last_name.sendKeys(lastName);
    }
    public void setAddress(String address) {
        address1.sendKeys(address);
    }
    public void setCity(String city) {
        city1.sendKeys(city);
    }
    public void selectDropDownState(String value) {
        new Select(state1).selectByVisibleText(value);
    }
    public void setPostal(String postcode) {
        zip.sendKeys(postcode);
    }
    public void clickSaveButton() {
        save_button.click();
    }
    public void clickRemove() {
        remove_button.click();
    }
    public void deleteAddress() {
        delete.click();
    }
}
