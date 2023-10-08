package finalEvaluation;

import java.io.*;
import java.util.Properties;

public class properties {
    public static Properties  prop = new Properties();
    public static void getProperties() throws FileNotFoundException {

        try {
            InputStream input = new FileInputStream("C:/Users/Rahul Gupta/IdeaProjects/LearnTestNG/src/test/java/finalEvaluation/p.properties");
            prop.load(input);
            String browser = prop.getProperty("browser");
            System.out.println(browser);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }
    public static void setProperties(String key,String value){
        try {
            OutputStream output = new FileOutputStream("C:/Users/Rahul Gupta/IdeaProjects/LearnTestNG/src/test/java/finalEvaluation/p.properties");
            prop.setProperty(key,value);
            prop.store(output,null);
        } catch ( Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        setProperties("browser","firefox");
        getProperties();

    }
}
