package com.ving.jpademo.controller;

import com.ving.jpademo.model.User;
import com.ving.jpademo.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author liuweijie
 * @date 2020/9/17
 */
@RestController
@RequestMapping(path = "/api/v1")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "user",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public User addNewUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping(path = "users")
    public Page<User> getAllUsers(Pageable request){
        return userRepository.findAll(request);
    }

}
