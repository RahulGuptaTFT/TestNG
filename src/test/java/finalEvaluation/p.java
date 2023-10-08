package finalEvaluation;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class p {
    @Test
    @Parameters({"text"})
    public void pa(String a){
        System.out.println(a);
    }
}
