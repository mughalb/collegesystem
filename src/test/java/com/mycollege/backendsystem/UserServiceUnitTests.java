package com.mycollege.backendsystem;

import com.mycollege.backendsystem.dto.UserDTO;
import com.mycollege.backendsystem.entities.User;
import com.mycollege.backendsystem.repositories.UserRepository;
import com.mycollege.backendsystem.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class UserServiceUnitTests {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void userIsAdded(){
        UserDTO userDTO = new UserDTO(1,"M","Talha");

        userService.addUser(userDTO);

        verify(userRepository).save(any(User.class));
    }
}
