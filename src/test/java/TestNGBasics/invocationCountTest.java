package TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class invocationCountTest {

    WebDriver driver;

    @BeforeMethod
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.google.com");
    }
    @Test(invocationCount = 2)
    void getTittle(){
        String tittle = driver.getTitle();
        System.out.println(tittle);
        driver.findElement(By.name("q")).sendKeys("Rahul namemeans in hindi");
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/" +
                "div[1]/span[1]//*[local-name()='svg']")).click();
    }
    @AfterMethod
    void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
}
