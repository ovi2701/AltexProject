package Altex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceDemoPage {
    public WebDriver webDriver;
    public WebElement userNameField = webDriver.findElement(By.cssSelector("#user-name"));

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

    @FindBy(css = "#first_name")
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

    public SauceDemoPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
