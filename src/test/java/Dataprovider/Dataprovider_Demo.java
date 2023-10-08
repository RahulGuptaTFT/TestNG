package Dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dataprovider_Demo {

    WebDriver driver;
    @Test(dataProvider = "LoginData")
    public void login(String userName,String pass){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://opensource-demo.orangehrmlive.com");

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).submit();

        //Assert.assertTrue(driver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[1]/span[1]/img[1]")).isDisplayed());
        driver.close();
    }

    @DataProvider(name = "LoginData")
    public static Object[][] login_data(){
        Object[][] data = new Object[4][2];
        data[0][0] = "Admin";
        data[0][1] = "admin123";

        data[1][0] = "x";
        data[1][1] = "admin123";

        data[2][0] = "Admin";
        data[2][1] = "xsdfg";

        data[3][0] = "x";
        data[3][1] = "asd";

        return data;
    }
}
