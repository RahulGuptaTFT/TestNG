package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssrt {
    @Test
    void print(){
        SoftAssert soft  =new SoftAssert();
        System.out.println("start");
        soft.assertEquals(1,2,"Not match");
        System.out.println("complete");
        soft.assertAll();
    }
}
