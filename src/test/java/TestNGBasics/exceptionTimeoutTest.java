package TestNGBasics;

import org.testng.annotations.Test;

public class exceptionTimeoutTest {

    @Test(timeOut = 1)
    void print() {
        int i = 0;
        while (i == 0) {
            System.out.println(i);
        }
    }

    @Test(expectedExceptions = NumberFormatException.class)
    void test() {
        String i = "123";
        Integer.parseInt("");
    }
}
