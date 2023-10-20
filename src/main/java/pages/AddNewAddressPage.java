package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class AddNewAddressPage extends BasePage {

    public AddNewAddressPage(WebDriver driver) {
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

        @FindBy(id = "field-id_country")
        private WebElement countryListField;

        @FindBy(id = "field-phone")
        private WebElement phoneInputField;

        @FindBy(css = "#content > div > div > form > footer > button")
        private WebElement saveButton;

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

        public WebElement getCountryListField () {
            return getVisibleElement(countryListField);
        }

        public WebElement getPhoneInputField () {
            return getVisibleElement(phoneInputField);
        }

        public WebElement getSaveButton () { return getVisibleElement(saveButton);}

        public void fulfillform (String alias, String address, String city, String zippostalcode, String phone){
            getAliasInputField().sendKeys(alias);
            getAddressInputField().sendKeys(address);
            getCityInputField().sendKeys(city);
            getZippostalcodeInputField().sendKeys(zippostalcode);
            getPhoneInputField().sendKeys(phone);

        }

    }