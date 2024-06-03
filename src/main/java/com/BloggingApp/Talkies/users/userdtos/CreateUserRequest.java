package com.BloggingApp.Talkies.users.userdtos;


import lombok.Data;

@Data
public class CreateUserRequest {

    private String username;
    private String email;
    private String password;
}
