package com.fritas.hello_word.service;


import org.springframework.stereotype.Service;

@Service
public class helloWorldService {
    public String helloWorld(String name){
        return "Hello service " + name;
    }
}
