package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressesPage extends BasePage {

    @FindBy(css = "#content > div.addresses-footer > a > span")
    private WebElement createNewAddressButton;

    public AddressesPage (WebDriver driver) {
        super(driver);
    }
    public WebElement getCreateNewAddressButton() {
        return getVisibleElement(createNewAddressButton);
    }
    public void clickCreateNewAddressButton() {
        getCreateNewAddressButton().click();
    }
}