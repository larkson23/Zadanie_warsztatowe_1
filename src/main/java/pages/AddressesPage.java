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

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/article/div[1]/address/text()[2]")
    private WebElement newAddress;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/article/div[1]/address/text()[3]")
    private WebElement newCity;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/article/div[1]/address/text()[4]")
    private WebElement newZippostalcode;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/article/div[1]/address/text()[6]")
    private WebElement newPhone;

    public WebElement getNewAddress() {
        return getVisibleElement(newAddress);
    }

    public WebElement getNewCity() {
        return getVisibleElement(newCity);
    }

    public WebElement getNewZippostalcode() {
        return getVisibleElement(newZippostalcode);
    }

    public WebElement getNewPhone() {
        return getVisibleElement(newPhone);
    }

    public String verifyNewAddress() {
        return getNewAddress().getText();
    }
    public String verifyNewCity() {
        return getNewCity().getText();
    }
    public String verifyNewZippostalcode() {
        return getNewZippostalcode().getText();
    }
    public String verifyNewPhone() {
        return getNewPhone().getText();
    }


    }