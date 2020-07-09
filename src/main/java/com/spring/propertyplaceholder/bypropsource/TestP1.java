package com.spring.propertyplaceholder.bypropsource;

import com.spring.propertyplaceholder.byconfigprop.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.env.OriginTrackedMapPropertySource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Optional;

@RestController
@PropertySource("classpath:x.properties")
public class TestP1 {
    @Autowired
    private ConfigurableEnvironment env;
    @Value("${test.name}")
    private String name;
    @Value("${test.age}")
    private int age;


    @GetMapping("/getdata")
    public String disp() {
        System.out.println(name);
        System.out.println(age);
        return name;
    }

}
