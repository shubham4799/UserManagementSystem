package com.userManagementSystem.demo.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
public class User {

    @NotBlank(message = "user id can not be null")
    private String userId;
    @NotEmpty(message = "name must not be empty")
    private String userName;
    @NotBlank(message = "DOB cannot be blank")
    private String dateOfBirth;
    @Email
    @NotEmpty
    private String email;

    private String Address;
    @Size(min = 10,max = 12)
    @Pattern(regexp = "^[0-9]+$")
    private String phoneNumber;
}
