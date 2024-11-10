package com.mycollege.backendsystem.controllers;

import com.mycollege.backendsystem.dto.UserDTO;
import com.mycollege.backendsystem.entities.User;
import com.mycollege.backendsystem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class MainController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public Iterable<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/find")
    public Optional<User> getUserById(@RequestParam long id){
        return userService.getUserDetails(id);
    }

    @PostMapping("/")
    public void addUser(@RequestBody UserDTO userDTO){
        userService.addUser(userDTO);
    }

}
