package Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    WebDriver driver;
    @Test
    @Parameters({"url","emailId","browser"})
    public void loginTest(String url,String emailId,String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
            driver.get(url);
            driver.findElement(By.name("username")).sendKeys(emailId);
            driver.findElement(By.name("signin")).click();
        }
    }
}
