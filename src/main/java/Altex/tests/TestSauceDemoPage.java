package Altex.tests;
import Altex.pages.SauceDemoPage;
import Altex.pageDefinition.SauceDemoPageDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSauceDemoPage {
    WebDriver driver;
    @BeforeTest
    public void  setDriver(){
        String filepath =  "./chromedriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", filepath);
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void TestSauce(){
        SauceDemoPage sdp = new SauceDemoPage(driver);
        SauceDemoPageDefinition sdpd = new SauceDemoPageDefinition(driver);
        sdpd.insertUserName(sdp.userNameField,"standard_user");
        sdpd.insertPassword(sdp.passwordField, "secret_sauce" );
        sdpd.pressLoginButton(sdp.loginButton);
        sdpd.pressAddToCartTShirt(sdp.addToCartTShirtBtn);
        sdpd.pressViewCart(sdp.viewCartBtn);
        sdpd.pressCheckout(sdp.checkoutBtn);
        sdpd.insertFirstNameForOrder(sdp.firstNameField, "Rares");
        sdpd.insertLastNameForOrder(sdp.lastNameField, "Botsch");
        sdpd.insertPostalCodeForOrder(sdp.postalCodeField, "507054");
        sdpd.pressContinue(sdp.continueBtn);
        sdpd.pressFinish(sdp.finishBtn);
        sdpd.pressBackToProducts(sdp.backToProductsBtn);

    }
    @AfterTest
    public void close(){
        driver.close();
    }
}
