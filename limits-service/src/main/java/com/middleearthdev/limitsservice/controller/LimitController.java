package com.middleearthdev.limitsservice.controller;

import com.middleearthdev.limitsservice.bean.Limits;
import com.middleearthdev.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private Configuration configuration;


    @GetMapping(path = "/limits")
    public Limits retreivaLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
//        return  new Limits(1,100);
    }
}
