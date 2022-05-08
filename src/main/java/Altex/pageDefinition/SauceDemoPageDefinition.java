package Altex.pageDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoPageDefinition {
    public WebDriver driver;
    public SauceDemoPageDefinition(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void insertUserName(WebElement userNameField, String key)
    {
        userNameField.sendKeys(key);
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


