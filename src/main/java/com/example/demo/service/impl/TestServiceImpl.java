package com.example.demo.service.impl;

import com.example.demo.service.TestService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnMissingBean(TestService.class)
public class TestServiceImpl implements TestService {

    @Override
    public String helloWorld() {
        return this.getClass().getCanonicalName() + " says hello world";
    }

}
