package com.spring.resources;

import com.spring.resources.service.CountWords;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

//@Component
public class MyRunner implements CommandLineRunner {

    @Value("classpath:thermopylae.txt")
    private Resource res;

    @Autowired
    private CountWords countWords;

    @Override
    public void run(String... args) throws Exception {

        Map<String, Integer> words =  countWords.getWordsCount(res);
        for (String key : words.keySet()) {
            System.out.println(key + ": " + words.get(key));
        }
    }
}