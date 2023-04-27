package com.userManagementSystem.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
public class User {

    private String userId;
    private String userName;
    private String email;
    private String Address;

    private String phoneNumber;
}
