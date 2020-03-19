package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private static String page_url="http://www.boxed.com";

    @FindBy(xpath = "//*[@id='g-top-nav-group']/nav/div/span[2]/span[1]/a[1]]")
    WebElement login_button;

    public HomePage(WebDriver driver){
        driver.get(page_url);
        PageFactory.initElements(driver, this);
    }
    public void clickLogin() {
        login_button.click();
    }
}
