package com.userManagementSystem.demo.controller;

import com.userManagementSystem.demo.model.User;
import com.userManagementSystem.demo.repository.UserDao;
import com.userManagementSystem.demo.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserManagementController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody User user){
        return userService.addNewUser(user);
    }
    @GetMapping(value = "/getAllUsers")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }
    @GetMapping(value = "getUser/{userId}")
    public User getUser(@PathVariable String userId){
        return userService.getUserByuserId(userId);
    }

    @PutMapping(value = "/updateUserInfo/")
    public String updateUserInfo(@RequestParam String userId, @RequestBody User user){
        return userService.updateUser(userId,user);
    }
    @DeleteMapping(value = "/deleteUser/{userid}")
    public String deleteUser(@PathVariable String userid) {

        return userService.deleteUserById(userid);
    }
}
