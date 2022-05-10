package Altex.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static WebDriver driver;

    public static WebDriver setDriver(){
        String filepath =  "./chromedriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", filepath);
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        return driver;

    }

}
