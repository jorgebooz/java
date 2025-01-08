package com.jorgebooz.user_register.controller;


import com.jorgebooz.user_register.model.Users;
import com.jorgebooz.user_register.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Users> createUser(@RequestBody Users user){
        System.out.println(user.toString());
        return ResponseEntity.ok(userService.save(user));

    }

    @GetMapping
    public ResponseEntity<List<Users>> findUser(){
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> findUser(@PathVariable Long id){
        return ResponseEntity.ok(userService.findId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
