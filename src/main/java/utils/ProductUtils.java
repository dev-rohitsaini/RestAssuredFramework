package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProductUtils {

    private static ProductUtils manager;
    private final static Properties prop = new Properties();

    private ProductUtils() throws Exception{
        InputStream inputStream = ProductUtils.class.getResourceAsStream("../resources/Config");
        try {
            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ProductUtils getInstance(){
        if(manager == null){
            synchronized (ProductUtils.class){
                try {
                    manager = new ProductUtils();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return manager;
    }

    public String getString(String key){
        return System.getProperty(key,prop.getProperty(key));
    }
}
