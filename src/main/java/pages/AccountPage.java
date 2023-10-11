package pages;

import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(id = "addresses-link")
    private WebElement addressesButton;

    public AccountPage (WebDriver driver) {
    super(driver);
    }
    public WebElement getAddressesButton() {
        return getVisibleElement(addressesButton);
    }
    public void clickAddressesButton() {
        getAddressesButton().click();
    }
}