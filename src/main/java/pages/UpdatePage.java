package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdatePage  extends BasePage {

    public UpdatePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "field-alias")
    private WebElement aliasInputField;

    @FindBy(id = "field-address1")
    private WebElement addressInputField;

    @FindBy(id = "field-city")
    private WebElement cityInputField;

    @FindBy(id = "field-postcode")
    private WebElement zippostalcodeInputField;

    @FindBy(id = "field-phone")
    private WebElement phoneInputField;

    public WebElement getAliasInputField () {
        return getVisibleElement(aliasInputField);
    }

    public WebElement getAddressInputField () {
        return getVisibleElement(addressInputField);
    }

    public WebElement getCityInputField () {
        return getVisibleElement(cityInputField);
    }

    public WebElement getZippostalcodeInputField () {
        return getVisibleElement(zippostalcodeInputField);
    }

    public WebElement getPhoneInputField () {
        return getVisibleElement(phoneInputField);
    }

    public String verifyNewAlias() {
        return getAliasInputField().getAttribute("value");
    }

    public String verifyNewAddress() {
        return getAddressInputField().getAttribute("value");
    }

    public String verifyNewCity() {
        return getCityInputField().getAttribute("value");
    }

    public String verifyNewZippostalcode() {
        return getZippostalcodeInputField().getAttribute("value");
    }

    public String verifyNewPhone() {
        return getPhoneInputField().getAttribute("value");
    }
}