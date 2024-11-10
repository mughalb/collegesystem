package com.mycollege.backendsystem.services;

import com.mycollege.backendsystem.dto.UserDTO;
import com.mycollege.backendsystem.entities.User;
import com.mycollege.backendsystem.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void addUser(UserDTO userDTO){
        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        userRepository.save(user);
    }

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserDetails(long id){
        return userRepository.findById(id);
    }
}
