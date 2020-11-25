package com.riverluoo.music.user.model;

import com.riverluoo.music.infra.utils.UuidGenerator;
import org.springframework.stereotype.Component;

@Component
public class UserIdGenerator {

    public UserId generate(){
        return UserId.userId(UuidGenerator.newUuid());
    }

}
