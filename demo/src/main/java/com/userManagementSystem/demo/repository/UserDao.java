package com.userManagementSystem.demo.repository;

import com.userManagementSystem.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

    List<User> userList = new ArrayList<>();
    public String save(User user) {
        userList.add(user);
        return "Added Successfully";
    }


    public List<User> getUsers() {
        return userList;
    }


    public boolean updateUsers(String userId,User user) {

        for(User userObj : userList){
            if(userObj.getUserId().equals(userId)){
                userObj.setUserName(user.getUserName());
                userObj.setEmail(user.getEmail());
                userObj.setAddress(user.getAddress());
                userObj.setPhoneNumber(user.getPhoneNumber());
                return true;
            }
        }
        return false;
    }


    public boolean removeUser(User userObj) {
        userList.remove(userObj);
        return true;
    }
}
