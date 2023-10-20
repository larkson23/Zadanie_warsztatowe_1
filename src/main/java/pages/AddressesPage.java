package pages;

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

@FindBy (partialLinkText = "/html/body/main/section/div/div/section/section/div[2]/article/div[1]/address/text()[2]")
    private WebElement newAddress;

    @FindBy(partialLinkText = "/html/body/main/section/div/div/section/section/div[2]/article/div[1]/address/text()[3]")
    private WebElement newCity;

    @FindBy(partialLinkText = "/html/body/main/section/div/div/section/section/div[2]/article/div[1]/address/text()[4]")
    private WebElement newZippostalcode;

    @FindBy(partialLinkText = "/html/body/main/section/div/div/section/section/div[2]/article/div[1]/address/text()[6]")
    private WebElement newPhone;

    public WebElement getNewAddress () {
        return getVisibleElement(newAddress);
    }

    public WebElement getNewCity () {
        return getVisibleElement(newCity);
    }

    public WebElement getZippostalcode () {
        return getVisibleElement(newZippostalcode);
    }

    public WebElement getPhone () {
        return getVisibleElement(newPhone);
    }

    public void isDisplayed (String address, String city, String zippostalcode, String phone) {
        getNewAddress();
        getNewCity();
        getZippostalcode();
        getPhone();
    }

    }
