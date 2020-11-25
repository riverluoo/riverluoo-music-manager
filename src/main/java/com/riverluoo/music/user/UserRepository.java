package com.riverluoo.music.user;

import com.riverluoo.music.infra.persistence.mybatisplus.LuooUserMapper;
import com.riverluoo.music.user.model.LuooUser;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserRepository {

    private final LuooUserMapper luooUserMapper;

    public void save(LuooUser luooUser){


        this.luooUserMapper.insert(luooUser);
    }


}
