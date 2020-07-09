package com.spring.propertyplaceholder.bypropsource;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class CustomPropSource extends PropertySource<Object> {

    private static final String externalProps = "x.properties";
    private static Properties props;

    public CustomPropSource() {
        super("custom");
        System.out.println("cons. is called");
        try {
            props = PropertiesLoaderUtils.loadAllProperties(externalProps);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getProperty(String s) {
        System.out.println(s);
        return props.getProperty(s);
    }
}
