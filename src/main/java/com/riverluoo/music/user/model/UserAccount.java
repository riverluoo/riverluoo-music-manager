package com.riverluoo.music.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class UserAccount {

    private String email;
    private String qq;
    private String phone;


    public UserAccount(String email) {
        this.email = email;
    }

    public static UserAccount of(String email){
        return new UserAccount(email);
    }

}
