package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id='emailForLogin']")
    WebElement emailid;

    @FindBy(xpath = "//*[@id='passwordForLogin']")
    WebElement passwd;

    @FindBy(xpath = "//form//button[text()='LOG IN']")
    WebElement login;

    public LogInPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        emailid.sendKeys(email);
    }
    public void enterPassword(CharSequence password) {
        passwd.sendKeys(password);
    }
    public void clickLoginButton() {
        login.click();
    }


}
