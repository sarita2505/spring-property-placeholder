package com.spring.propertyplaceholder.bypropsource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.env.OriginTrackedMapPropertySource;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

import javax.annotation.PostConstruct;

@Configuration
public class AppConfig {

    @Autowired
    private ConfigurableEnvironment env;

    @PostConstruct
    public void init()
    {
        org.springframework.core.env.PropertySource ps = null;

        for(PropertySource propertySource:env.getPropertySources())
        {
            if(propertySource instanceof OriginTrackedMapPropertySource)
            {
                ps = propertySource;
                break;
            }
        }

        System.out.println("==========="+ps.getName()+"==========");
        env.getPropertySources().addBefore(ps.getName(),new CustomPropSource());
    }
}
