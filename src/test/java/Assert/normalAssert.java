package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class normalAssert {
    @Test
    void orint(){
        Assert.assertEquals(2,2,"Not match");
    }
    @Test
    void or1int(){
        Assert.assertEquals(2,2,"Not match");
    }
}
