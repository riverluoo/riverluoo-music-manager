package com.riverluoo.music.infra.utils;

import java.util.UUID;

public final class UuidGenerator {

    public static String newUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }


}
