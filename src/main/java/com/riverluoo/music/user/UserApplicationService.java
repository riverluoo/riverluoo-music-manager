package com.riverluoo.music.user;

import com.riverluoo.music.user.command.CreateUserCommand;
import com.riverluoo.music.user.command.UserLoginCommand;
import com.riverluoo.music.user.model.LuooUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserApplicationService {

    private final UserRepository userRepository;

    public String createUser(CreateUserCommand command) {
        LuooUser luooUser = LuooUser.create(command.getUsername(), command.getPassword(), command.getPortrait(), command.getAddress(), command.getUserAccount());
        userRepository.save(luooUser);

        return luooUser.getId();
    }

    public void login(UserLoginCommand command){


    }

}
