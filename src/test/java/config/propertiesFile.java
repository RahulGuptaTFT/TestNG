package config;
import demo.*;
import java.io.*;
import java.util.Properties;

public class propertiesFile {
    static Properties p1 = new Properties();
    static String path = System.getProperty("user.dir");

    public static void getProperties(){

        try {
            InputStream input = new FileInputStream(path +"/src/test/java/config/config.properties");
            p1.load(input);
            String browser = p1.getProperty("browser");
            String url = p1.getProperty("url");
            demo.browserName = browser;
            demo.url = url;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }
    public static void setProperties(String key,String value){
        try {
            OutputStream output = new FileOutputStream(path +"/src/test/java/config/config.properties");
            p1.setProperty(key,value);
            p1.store(output,null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getProperties();
        setProperties("browser","chrome");
        getProperties();

    }
}
