package com.driver.services;

import com.driver.models.*;
import com.driver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository3;

    @Autowired
    BlogService blogService3;

    public void createUser(User user){

        userRepository3.save(user);
    }

    public void deleteUser(int userId){
        if(userRepository3.findById(userId).isPresent())
        {
            userRepository3.deleteById(userId);
        }
    }

    public void updateUser(User user) {
        User updateuser = userRepository3.findByUsername(user.getUsername());
       if(updateuser!=null){
           updateuser.setLastName(user.getLastName());
           updateuser.setFirstName(user.getFirstName());
           updateuser.setPassword(user.getPassword());
           updateuser.setUsername(user.getUsername());
           userRepository3.save(updateuser);
       }
       userRepository3.save(user);


    }

    public User findUserByUsername(String username){
        return userRepository3.findByUsername(username);
    }
}