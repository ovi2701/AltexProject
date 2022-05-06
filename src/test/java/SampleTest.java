import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
    @Test
    public void Test1() throws InterruptedException {
        String filepath =  "./chromedriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", filepath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.cssSelector("#first-name")).sendKeys("Rares");
        driver.findElement(By.id("last-name")).sendKeys("Botsch");
        driver.findElement(By.cssSelector("#postal-code")).sendKeys("507054");
        driver.findElement(By.cssSelector("#continue")).click();
        driver.findElement(By.cssSelector("#finish")).click();
        driver.findElement(By.id("back-to-products")).click();
        driver.close();

        Thread.sleep(3000);

    }
}
