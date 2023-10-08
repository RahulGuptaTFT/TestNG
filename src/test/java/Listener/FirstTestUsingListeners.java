package Listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/* use this "Listeners(Listener.TestNGListener.class)" on class level only.
   for multiple classes use on suite level in testing.xml file via =>
   <listeners>
        <listener class-name="Listener.TestNGListener"></listener>
    </listeners>
*/
@Listeners(TestNGListener.class)
public class FirstTestUsingListeners {
    WebDriver driver;
    @BeforeMethod
    void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
    @Test
    public void getTttle(){

        System.out.println(driver.getTitle());

    }

    @Test
    public void check(){

        String title = driver.getTitle();
        Assert.assertEquals(title,"Google");
    }
    @AfterMethod
    void teardown(){
        driver.quit();
    }


}
