package com.riverluoo.music.user.model;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import static com.riverluoo.music.infra.utils.UuidGenerator.newUuid;

@Data
@Builder
@Slf4j
public class UserId {
    private String id;

    public UserId() {
    }

    public UserId(String id) {
        this.id = id;
    }

    public static UserId userId(String id) {
        return new UserId(id);
    }

    public static UserId newUserId() {
        return new UserId(newUuid());
    }


}
