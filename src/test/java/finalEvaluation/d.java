package finalEvaluation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class d {
    @Test(dataProvider = "as")
    public void pa(char a){

        System.out.println(a);
    }

    @DataProvider(name = "as")
    public Object[] sd(){
        Object data[]=new Object[2];
        data[0]='a';
        data[1]='b';
        return data ;
    }
}
