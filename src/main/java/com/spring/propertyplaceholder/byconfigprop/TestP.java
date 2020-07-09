package com.spring.propertyplaceholder.byconfigprop;

import com.spring.propertyplaceholder.byconfigprop.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestP {
    @Autowired
    private TestModel testModel;
    @GetMapping("/getprop")
    public int disp(){
        System.out.println(testModel.getAge());
        System.out.println(testModel.getName());
        return testModel.getAge();
    }

}
