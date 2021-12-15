package com.nouvelle.nftviewer.controller;

import java.util.Map;

import com.nouvelle.nftviewer.repository.UserRepository;
import com.nouvelle.nftviewer.entity.*;

import org.h2.engine.UserBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import lombok.*;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/")
    public @ResponseBody List<User> createUser(@RequestBody Map<String,String> param){
        String firstName = param.get("firstName");
		String lastName = param.get("lastName");
        String email = param.get("email");
        String phone = param.get("phone");

		User user = User.builder()
                            .firstName(firstName)
                            .lastName(lastName)
                            .email(email)
                            .phone(phone)
                            .build();
		
        userRepository.save(user);
		
		return userRepository.findAll();
    }
    
}
