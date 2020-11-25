package com.riverluoo.music.user.command;

import com.riverluoo.music.infra.utils.Address;
import com.riverluoo.music.user.model.UserAccount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserCommand {

    private String name;
    private String portrait;
    private String password;
    private Address address;
    private UserAccount userAccount;

}
