package com.userManagementSystem.demo.service;

import com.userManagementSystem.demo.model.User;
import com.userManagementSystem.demo.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;
    public String addNewUser(User user) {
        return userDao.save(user);

    }

    public List<User> getAllUsers() {
        return userDao.getUsers();
    }

    public User getUserByuserId(String userId) {
        List<User> helperList = getAllUsers();
        for(User user : helperList){
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }

    public String updateUser(String userId,User user) {
        boolean updateStatus = userDao.updateUsers(userId,user);
        if(updateStatus){
            return "user" + userId + "was updated";
        }else{
            return "user " + userId + " not found";
        }
    }


    public String deleteUserById(String userid) {
        List<User> helper = getAllUsers();
        boolean status = false;
        for(User userObj : helper){
            if(userObj.getUserId().equals(userid)){
                status = userDao.removeUser(userObj);
                if(status){
                    return "user removed";
                }else{
                    return "user not removeble";
                }

            }
        }
        return " user not found ";
    }
}
