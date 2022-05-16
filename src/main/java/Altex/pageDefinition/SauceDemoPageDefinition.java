package Altex.pageDefinition;
import Altex.config.Log4jConfig;
import Altex.driver.Driver;
import Altex.pages.SauceDemoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

public class SauceDemoPageDefinition extends Driver {
    SauceDemoPage sdp = PageFactory.initElements(driver, SauceDemoPage.class);
    Log4jConfig lg4config = new Log4jConfig();
    public void loginPage(String username, String password)
    {
        lg4config.propertiesConfigure();
        sdp.userNameField.sendKeys(username);
        sdp.passwordField.sendKeys(password);
        sdp.loginButton.click();

    }

    private WebElement addToCartArticle(String article_code) {
        return sdp.addToCartArticle = driver.findElement(By.name(article_code));
    }

    public void addProductsAndViewCart(){
        addToCartArticle("add-to-cart-sauce-labs-bolt-t-shirt").click();
        addToCartArticle("add-to-cart-sauce-labs-bike-light").click();
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

    public void checkIfLoginWorks(){

        Assert.assertEquals("Open Menu",sdp.openMenuButtonInMainPage.getText());
        Assert.assertTrue(sdp.cartButtonInMainPage.isDisplayed());
        lg4config.log.info("Login was succesful!");

    }

    private WebElement removeArticle(String article_code) {
        return sdp.removeItem = driver.findElement(By.name(article_code));
    }

    public void checkIfAddProductAndViewCartPageFunctionalityWorks()
    {
        Assert.assertEquals("YOUR CART", sdp.cartPageTitle.getText());
        Assert.assertEquals("REMOVE",removeArticle("remove-sauce-labs-bolt-t-shirt").getText());
        Assert.assertEquals("REMOVE",removeArticle("remove-sauce-labs-bike-light").getText());
        lg4config.log.info("Products added successfully in the cart!");
    }

    public void checkIfOrderSent()
    {
        Assert.assertEquals("THANK YOU FOR YOUR ORDER",sdp.sentOrderMessage.getText());
        lg4config.log.info("Order has been sent successfully!");
    }
}


