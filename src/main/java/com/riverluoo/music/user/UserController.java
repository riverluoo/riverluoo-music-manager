package com.riverluoo.music.user;


import com.riverluoo.music.infra.HttpResult.HttpResult;
import com.riverluoo.music.user.command.CreateUserCommand;
import com.riverluoo.music.user.model.UserId;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserApplicationService userApplicationService;


    @PostMapping
    public HttpResult<UserId> create(@RequestBody CreateUserCommand command) {

        return HttpResult.success(this.userApplicationService.createUser(command));
    }


}
