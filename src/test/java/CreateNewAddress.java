import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.asynchttpclient.util.Assertions;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.testng.asserts.Assertion;
import pages.*;
import static org.junit.Assert.assertEquals;


import static org.testng.AssertJUnit.assertEquals;

public class CreateNewAddress {

    private WebDriver driver;

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Given("an open browser with https:\\/\\/mystore-testlab.coderslab.pl")
    public void anOpenBrowserWithHttpsMystoreTestlabCoderslabPl() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    @When("User clicked Sign In")
    public void userIsLoggedIn() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickUserSignInButton();

    }

    @And("User log in with {} {}")
    public void userLogIn(String arg5, String arg6) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.writeEmail(arg5);
        loginPage.writePassword(arg6);
        loginPage.clickSignInButton();
    }

    @And("User clicked Addresses")
    public void userClickedAddresses() {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickAddressesButton();
    }

    @And("User clicked Create new address")
    public void userClickedCreateNewAddress() {
        AddressesPage addressesPage = new AddressesPage(driver);
        addressesPage.clickCreateNewAddressButton();
    }

    @And("Form is fulfilled with data {} {} {} {} {}")
    public void formIsFulfilledWithDataAliasAddressCityZipPostalcodeCountryPhone(String arg0, String arg1, String arg2, String arg3, String arg4) {
        AddNewAddressPage addNewAddressPage = new AddNewAddressPage(driver);
        addNewAddressPage.fulfillform(arg0, arg1, arg2, arg3, arg4);
        addNewAddressPage.getSaveButton().click();


    }

    @Then("It is checked whether the address has been added {} {} {} {} {}")
    public void itIsCheckedWhetherTheAddressHasBeenAdded(String arg0, String arg1, String arg2, String arg3, String arg4) {
        AddressesPage addressesPage = new AddressesPage(driver);
        UpdatePage updatePage = new UpdatePage(driver);
        addressesPage.getUpdateButton().click();
        String newAlias = updatePage.verifyNewAlias();
        String newAddress = updatePage.verifyNewAddress();
        String newCity = updatePage.verifyNewCity();
        String newZippostalcode = updatePage.verifyNewZippostalcode();
        String newPhone = updatePage.verifyNewPhone();
        assertEquals(arg0, newAlias);
        assertEquals(arg1, newAddress);
        assertEquals(arg2, newCity);
        assertEquals(arg3, newZippostalcode);
        assertEquals(arg4, newPhone);

    }

    @After
    public void after() {
        driver.close();
        driver.quit();
    }
}


