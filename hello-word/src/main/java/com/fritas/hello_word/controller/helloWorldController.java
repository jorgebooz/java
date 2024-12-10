package com.fritas.hello_word.controller;

import com.fritas.hello_word.domain.User;
import com.fritas.hello_word.service.helloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class helloWorldController {

    @Autowired
    private helloWorldService helloWorldService;

    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("fritas");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body){
        return "Hello World" + body.getName() + id + filter;
    }
}
