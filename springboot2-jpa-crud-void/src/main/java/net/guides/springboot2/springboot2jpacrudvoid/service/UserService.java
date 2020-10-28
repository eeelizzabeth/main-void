package net.guides.springboot2.springboot2jpacrudvoid.service;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.guides.springboot2.springboot2jpacrudvoid.model.User;
import net.guides.springboot2.springboot2jpacrudvoid.repository.UserRepository;

//Remember to annotate what type of class this is!
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    //give your add functionality here, like check if user already exists
    public void addUser(User u) 
    {
        userRepository.insert(u);
    }

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }


    
}
