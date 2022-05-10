package Altex.pageDefinition;
import Altex.driver.Driver;
import Altex.pages.SauceDemoPage;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoPageDefinition extends Driver {
    SauceDemoPage sdp = PageFactory.initElements(driver, SauceDemoPage.class);

    public void loginPage(String username, String password)
    {
        sdp.userNameField.sendKeys(username);
        sdp.passwordField.sendKeys(password);
        sdp.loginButton.click();

    }

    public void addProductAndViewCart(){
        sdp.addToCartTShirtBtn.click();
        sdp.viewCartBtn.click();
    }

    public void placeOrder(String first_name, String last_name, String postal_code)
    {
        sdp.checkoutBtn.click();
        sdp.firstNameField.sendKeys(first_name);
        sdp.lastNameField.sendKeys(last_name);
        sdp.postalCodeField.sendKeys(postal_code);
        sdp.continueBtn.click();
        sdp.finishBtn.click();
    }

    public void pressBackToProducts()
    {
        sdp.backToProductsBtn.click();
    }
}


