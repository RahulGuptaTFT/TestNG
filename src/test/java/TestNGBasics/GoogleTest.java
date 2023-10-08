package TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class GoogleTest {
    WebDriver driver;

    @BeforeMethod
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.google.com");
    }
    @Test(priority = 1,groups = "tittle")
    void getTittle(){
        String tittle = driver.getTitle();
        //System.out.println(tittle);
        // validation
        Assert.assertEquals(tittle,"Google","Tittle is not match");
    }
    @Test(priority = 3,groups = "url")
    void url(){
        String t = driver.getCurrentUrl();
        //System.out.println(t);
        Assert.assertEquals(t,"https://www.google.com/","URL Not match");
    }
    @Test(priority = 2,groups = "logo")
    void logo(){
        boolean d = driver.findElement(By.xpath("//body/div[1]/div[2]" +
                "/div[1]/img[1]")).isDisplayed();
        Assert.assertTrue(d);
    }
    @AfterMethod
    void tearDown() throws InterruptedException {
        //Thread.sleep(1000);
        driver.close();
    }
}
