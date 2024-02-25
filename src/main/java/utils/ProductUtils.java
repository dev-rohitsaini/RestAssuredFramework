package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProductUtils {

    private static final ProductUtils INSTANCE = new ProductUtils(); // Eager initialization
    private final Properties prop;

    private ProductUtils() {
        try (InputStream inputStream = ProductUtils.class.getClassLoader().getResourceAsStream("../../../resources/Config")) {
            if (inputStream == null) {

                throw new IllegalStateException("Config file not found");
            }
            prop = new Properties();
            prop.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load properties", e);
        }
    }

    public static ProductUtils getInstance() {
        return INSTANCE; // Singleton instance
    }

    public String getString(String key) {
        return System.getProperty(key, prop.getProperty(key));
    }
}
