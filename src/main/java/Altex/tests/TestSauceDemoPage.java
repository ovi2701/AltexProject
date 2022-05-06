package Altex.tests;
import Altex.pages.SauceDemoPage;
import Altex.pageDefinition.SauceDemoPageDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.lang.InterruptedException;

public class TestSauceDemoPage {
    @Test
    public void TestSauce() throws InterruptedException {
        String filepath =  "./chromedriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", filepath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        SauceDemoPage sdp = new SauceDemoPage(driver);
        SauceDemoPageDefinition sdpd = new SauceDemoPageDefinition();
        sdpd.insertUserName("standard_user");
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

        Thread.sleep(3000);


    }
}
