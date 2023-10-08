package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class hardAssrt {
    @Test
    void print(){
        System.out.println("Started");
        Assert.assertEquals(1,2,"Not match");
        System.out.println("Completed");
    }
    @Test
    void pr1int(){
        System.out.println("Started");
        Assert.assertEquals(2,2,"Not match");
        System.out.println("Completed");
    }
}
