package configs;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;

public class LoadEnvironmentalConfig {
    public Properties properties;
    BufferedReader reader;

    public LoadEnvironmentalConfig() throws IOException {
        HashMap<String, HashMap<String, String>> OuterpropertyMap = new HashMap<String, HashMap<String,String>>();

        OuterpropertyMap.put("QA", load("src/test/resources/configs/BDD-qa.properties"));
        OuterpropertyMap.put("DEV", load("src/test/resources/configs/BDD-dev.properties"));
        OuterpropertyMap.put("PROD", load("src/test/resources/configs/BDD-prod.properties"));
        OuterpropertyMap.put("LOCAL", load("src/test/resources/configs/BDD-local.properties"));
        properties.putAll(OuterpropertyMap.get(getEnv()));
        properties.getProperty("");
    }

    private HashMap<String, String> load(String filepath) throws IOException {
        HashMap<String, String> innerpropertyMap = new HashMap<String, String>();
        properties = new Properties();

        reader = new BufferedReader(new FileReader(filepath));
        properties.load(reader);
        reader.close();
        for (String key : properties.stringPropertyNames()) {
            String value = properties.getProperty(key);
            innerpropertyMap.put(key, value);
        }
        return innerpropertyMap;
    }


    private String getEnv() {
        if(System.getProperty("env")==null)
            System.setProperty("env","QA");
        return System.getProperty("env");
    }


    }