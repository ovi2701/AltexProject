package Altex.tests;
import Altex.driver.Driver;
import Altex.pageDefinition.SauceDemoPageDefinition;
import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.Base64;
import java.util.Base64.Decoder;
import Altex.Model.Model;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSauceDemoPage extends Driver {
    String username, password, first_name, last_name, postal_code;
    @BeforeTest
    public void setup(){
        driver = Driver.setDriver();
        initializeDataFromJSON();
    }
    public void initializeDataFromJSON(){
        JSONParser parser = new JSONParser();
        try {
        Object obj = parser.parse(new FileReader("./src/main/java/Data.json"));
        JSONObject jsonObject = (JSONObject)obj;
        Model m = new Model();

        m.setUsername(jsonObject);
        username = m.getUsername();

        m.setPassword(jsonObject);
        password = m.getPassword();
        Decoder decoder = Base64.getDecoder();
        byte[] bytes = decoder.decode(password);
        password = new String(bytes);

        m.setFirst_name(jsonObject);
        first_name = m.getFirst_name();

        m.setLast_name(jsonObject);
        last_name = m.getLast_name();

        m.setPostal_code(jsonObject);
        postal_code = m.getPostal_code();

    } catch(Exception e) {
        e.printStackTrace();
    }
    }
    @Test
    public void TestSauce(){
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
