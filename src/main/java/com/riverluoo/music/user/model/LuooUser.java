package com.riverluoo.music.user.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import com.riverluoo.music.infra.utils.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

import static com.riverluoo.music.infra.utils.UuidGenerator.newUuid;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class LuooUser {

    private String id;
    private String username;
    private String portrait;
    private String password;
    @TableField(typeHandler = FastjsonTypeHandler.class)
    private Address address;
    @TableField(typeHandler = FastjsonTypeHandler.class)
    private UserAccount userAccount;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    private LuooUser(String username, String password, String portrait, Address address, UserAccount userAccount) {
        this.id = newUuid();
        this.username = username;
        this.portrait = portrait;
        this.password = password;
        this.address = address;
        this.userAccount = userAccount;
        this.createTime = LocalDateTime.now();
    }


    public static LuooUser create(String username, String password, String portrait, Address address, UserAccount userAccount) {
        return new LuooUser(username, password, portrait, address, userAccount);
    }


}
