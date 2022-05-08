package Altex.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoPage {
    public WebDriver driver;

    public SauceDemoPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#user-name")
    public WebElement userNameField;

    @FindBy(css = "#password")
    public WebElement passwordField;

    @FindBy(css = "#login-button")
    public WebElement loginButton;

    @FindBy(name = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement addToCartTShirtBtn;

    @FindBy(className = "shopping_cart_link")
    public WebElement viewCartBtn;

    @FindBy(id = "checkout")
    public WebElement checkoutBtn;

    @FindBy(css = "#first-name")
    public WebElement firstNameField;

    @FindBy(id = "last-name")
    public WebElement lastNameField;

    @FindBy(css = "#postal-code")
    public WebElement postalCodeField;

    @FindBy(css = "#continue")
    public WebElement continueBtn;

    @FindBy(css = "#finish")
    public WebElement finishBtn;

    @FindBy(id = "back-to-products")
    public WebElement backToProductsBtn;

}
