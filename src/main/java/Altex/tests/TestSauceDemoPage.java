package Altex.tests;

import Altex.driver.Driver;
import Altex.pageDefinition.SauceDemoPageDefinition;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Base64;
import java.util.Base64.Decoder;

import Altex.Model.TestData;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSauceDemoPage extends Driver {
    String username, password, first_name, last_name, postal_code;
    SauceDemoPageDefinition sdpd;

    @BeforeTest
    public void setup() {
        driver = Driver.setDriver();
        initializeDataFromJSON();
        sdpd = new SauceDemoPageDefinition();
    }

    public void initializeDataFromJSON() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {

            TestData testData = objectMapper.readValue(new File("./src/main/java/Data.json"), TestData.class);
            username = testData.getUsername();
            password = testData.getPassword();
            Decoder decoder = Base64.getDecoder();
            byte[] bytes = decoder.decode(password);
            password = new String(bytes);
            first_name = testData.getFirst_name();
            last_name = testData.getLast_name();
            postal_code = testData.getPostal_code();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test()
    public void TestLogin() throws IOException {
        sdpd.loginPage(username, password);
        TakeScreenShot();
        sdpd.checkIfLoginWorks();

    }

    @Test(priority = 1)
    public void TestAddingProductsAndViewCart() throws IOException {
        sdpd.addProductsAndViewCart();
        TakeScreenShot();
        sdpd.checkIfAddProductAndViewCartPageFunctionalityWorks();
    }

    @Test(priority = 2)
    public void TestPlaceOrder() throws IOException {
        sdpd.placeOrder(first_name, last_name, postal_code);
        TakeScreenShot();
        sdpd.checkIfOrderSent();
        sdpd.pressBackToProducts();
    }

    @AfterTest
    public void close() {
        driver.close();
    }

}
