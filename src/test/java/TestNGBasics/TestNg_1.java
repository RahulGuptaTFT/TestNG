package TestNGBasics;

import org.testng.annotations.*;

import java.util.concurrent.ExecutionException;

public class TestNg_1 {
   /*
 Ørder for Execution =>
BeforeSuite
BeforeTest
BeforeClass

BeforeMethod
test-3
AfterMethod

BeforeMethod
test-1
AfterMethod

BeforeMethod
test-2
AfterMethod

AfterClass
AfterTest
AfterSuite
    */


    // Pre-conditions annotations -- starting with @Before

    @BeforeSuite
    void setup(){
        System.out.println("BeforeSuite");
    }
    @BeforeTest
    void URL(){
        System.out.println("BeforeTest");
    }
    @BeforeClass
    void launch(){
        System.out.println("BeforeClass");
    }
    @BeforeMethod
    void login(){
        System.out.println("BeforeMethod");
    }

    //test cases annotations--starting with @Test

    @Test
    void google(){
        System.out.println("test-1");
    }
    @Test
    void searchText(){
        System.out.println("test-2");
    }
    @Test
    void aa(){
        System.out.println("test-3");
    }

    // Post-conditions annotations -- starting with @After

    @AfterMethod
    void delete(){
        System.out.println("AfterMethod");
    }
    @AfterClass
    void logout(){
        System.out.println("AfterClass");
    }
    @AfterTest
    void gh(){
        System.out.println("AfterTest");
    }
    @AfterSuite
    void su(){
        System.out.println("AfterSuite");
    }
}
