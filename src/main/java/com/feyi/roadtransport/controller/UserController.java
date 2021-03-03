package com.feyi.roadtransport.controller;

import com.feyi.roadtransport.Dto.UserDto;
import com.feyi.roadtransport.model.User;
import com.feyi.roadtransport.repositories.UserRepository;
import com.feyi.roadtransport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;


//@RequestMapping("/user")
@RestController
public class UserController {
//
    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @PostMapping("/signup")
    public String createUser(@RequestBody UserDto user){
        System.out.println("data received  from client =====" + user);
//        userService.saveUser(user);

        return null;
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody User user){
        userService.loginUser(user);
        return "Successfully logged in user";
    }
}
