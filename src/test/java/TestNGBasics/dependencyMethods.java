package TestNGBasics;

import org.testng.annotations.Test;

public class dependencyMethods {

    @Test
    void loginTest(){
        System.out.println("Done");
    }

    /* This test is totally depend upon "loginTest" method,
       if that method fails this "homePageTest"
       method will not execute.
     */
    @Test(dependsOnMethods = "loginTest")
    void homePageTest(){
        System.out.println("Done");
    }
}
