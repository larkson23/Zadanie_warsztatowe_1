package pages;

import dev.failsafe.internal.util.Assert;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressesPage extends BasePage {

    @FindBy(css = "#content > div.addresses-footer > a > span")
    private WebElement createNewAddressButton;

    public AddressesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCreateNewAddressButton() {
        return getVisibleElement(createNewAddressButton);
    }

    public void clickCreateNewAddressButton() {
        getCreateNewAddressButton().click();
    }

    @FindBy(css = "#address-5976 > div.address-body > address")
    private WebElement newFullAddress;

    @FindBy(css = "#address-5976 > div.address-footer > a:nth-child(1)")
    private WebElement updateButton;

    public WebElement getUpdateButton() {
        return getVisibleElement(updateButton);
    }


    public WebElement getNewAddress() {
        return getVisibleElement(newFullAddress);
    }

    public String verifyNewAddress() {
        return getNewAddress().getText();
    }

    public String verifyNewCity() {
        return getNewAddress().getText();
    }

    public String verifyNewZippostalcode() {
        return getNewAddress().getText();
    }

    public String verifyNewPhone() {
        return getNewAddress().getText();
    }
}