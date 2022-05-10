package Altex.tests;
import Altex.driver.Driver;
import Altex.pageDefinition.SauceDemoPageDefinition;
import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSauceDemoPage extends Driver {
    String username, password, first_name, last_name, postal_code;
    @BeforeTest
    public void setup(){
        driver = Driver.setDriver();
    }
    public void initializeDataFromJSON(){
        JSONParser parser = new JSONParser();
        try {
        Object obj = parser.parse(new FileReader("./src/main/java/Data.json"));
        JSONObject jsonObject = (JSONObject)obj;
        username = (String)jsonObject.get("username");
        password = (String)jsonObject.get("password");
        first_name = (String)jsonObject.get("first_name");
        last_name = (String)jsonObject.get("last_name");
        postal_code = (String)jsonObject.get("postal_code");
    } catch(Exception e) {
        e.printStackTrace();
    }
    }
    @Test
    public void TestSauce(){
            initializeDataFromJSON();
            SauceDemoPageDefinition sdpd = new SauceDemoPageDefinition();
            sdpd.loginPage(username,password);
            sdpd.addProductAndViewCart();
            sdpd.placeOrder(first_name, last_name, postal_code);
            sdpd.pressBackToProducts();
    }
    @AfterTest
    public void close(){
        driver.close();
    }

}
