import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import pages.*;

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
    public void userLogIn(String arg6, String arg7) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.writeEmail(arg6);
        loginPage.writePassword(arg7);
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

    @And("Form is fulfilled with data {} {} {} {} {} {}")
    public void formIsFulfilledWithDataAliasAddressCityZipPostalcodeCountryPhone(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        AddNewAddressPage addNewAddressPage = new AddNewAddressPage(driver);
        addNewAddressPage.fulfillform(arg0, arg1, arg2, arg3, arg4, arg5);

    }

    @Then("It is checked whether the address has been added")
    public void itIsCheckedWhetherTheAddressHasBeenAdded() {
    }

    @After
    public void after() {
        driver.close();
        driver.quit();
    }
}


