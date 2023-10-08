package demo;

import config.propertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo {
    WebDriver driver = null;
    public static String browserName = null;
    public static String url = null;
     @BeforeMethod
     public void setUp(){
         propertiesFile.setProperties("browser","firefox");
         propertiesFile.getProperties();
         if (browserName.equalsIgnoreCase("chrome")){
             driver = new ChromeDriver();
             driver.get(url);
         } else if (browserName.equalsIgnoreCase("firefox")) {
             driver = new FirefoxDriver();
             driver.get(url);
         }
     }
    @Test
    void print(){
        System.out.println("In Demo");
    }
    @AfterMethod
    public void tearDown(){
         driver.close();
         propertiesFile.setProperties("url","https://www.facebook.com");
    }
}
