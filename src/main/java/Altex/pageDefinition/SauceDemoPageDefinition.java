package Altex.pageDefinition;
import Altex.pages.SauceDemoPage;
import org.openqa.selenium.WebElement;

public class SauceDemoPageDefinition {
    SauceDemoPage sdp;
    public void insertUserName( String key)
    {
        this.sdp.userNameField.sendKeys(key);
    }

    public void insertPassword(WebElement passwordField, String key)
    {
        passwordField.sendKeys(key);
    }

    public void pressLoginButton(WebElement loginButton)
    {
        loginButton.click();
    }

    public void pressAddToCartTShirt(WebElement addToCartTShirtBtn)
    {
        addToCartTShirtBtn.click();
    }

    public void pressViewCart(WebElement viewCartBtn)
    {
        viewCartBtn.click();
    }

    public void pressCheckout(WebElement checkoutBtn)
    {
        checkoutBtn.click();
    }

    public void insertFirstNameForOrder(WebElement firstNameField, String key)
    {
        firstNameField.sendKeys(key);
    }

    public void insertLastNameForOrder(WebElement lastNameField, String key)
    {
        lastNameField.sendKeys(key);
    }

    public void insertPostalCodeForOrder(WebElement postalCodeField, String key)
    {
        postalCodeField.sendKeys(key);
    }

    public void pressContinue(WebElement continueBtn)
    {
        continueBtn.click();
    }

    public void pressFinish(WebElement finishBtn)
    {
        finishBtn.click();
    }

    public void pressBackToProducts(WebElement backToProductsBtn)
    {
        backToProductsBtn.click();
    }
}


