package com.mycompany.patterns.singleton;

import lombok.Getter;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@Getter
public class Configuration {
    private static Configuration instance;
    private final static String CONFIG_FILE_PATH = "/config.yaml";

    private String propertyOne;
    private String propertyTwo;
    private String propertyThree;

    public static Configuration getInstance() {
        if(instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    private Configuration() {
        loadConfig();
    }

    private void loadConfig() {
        try (InputStream input =
                     getClass().getResourceAsStream(CONFIG_FILE_PATH)) {
            Yaml yaml = new Yaml();
            Map<String, Object> config = yaml.load(input);

            if (config != null) {
                propertyOne = config.get("property-one").toString();
                propertyTwo = config.get("property-two").toString();
                propertyThree = config.get("property-three").toString();
            }

        } catch (IOException e) {
            throw new RuntimeException("Error while reading config: %s"
                    .formatted(e.getMessage()));
        }
    }
}
