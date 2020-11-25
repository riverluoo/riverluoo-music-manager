package com.riverluoo.music.user.model;

import com.riverluoo.music.infra.utils.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class LuooUser {

    private UserId id;
    private String name;
    private String portrait;
    private String password;
    private Address address;
    private UserAccount userAccount;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    private LuooUser(String name, String password, String portrait, Address address, UserAccount userAccount) {
        this.id = UserId.newUserId();
        this.name = name;
        this.portrait = portrait;
        this.password = password;
        this.address = address;
        this.userAccount = userAccount;
        this.createTime = LocalDateTime.now();
    }


    public static LuooUser create(String name, String password, String portrait, Address address, UserAccount userAccount) {
        return new LuooUser(name, password, portrait, address, userAccount);
    }


}
