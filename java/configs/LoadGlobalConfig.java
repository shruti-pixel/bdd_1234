package configs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoadGlobalConfig {
    private Properties properties;
    private final String propertyFilePath = "src/test/resources/configs/global.properties";


    public LoadGlobalConfig() throws IOException {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(propertyFilePath));
        properties = new Properties();
        properties.load(reader);
        reader.close();
        System.out.println("project_id "+ properties.get("project_id"));
    }
}