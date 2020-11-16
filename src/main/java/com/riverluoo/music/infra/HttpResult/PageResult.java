package com.riverluoo.music.infra.HttpResult;


import lombok.Getter;

import java.util.Collection;

@Getter
public class PageResult<T> {

    private final Integer current;
    private final Integer size;
    private final Long total;
    private final Collection<T> records;

    public PageResult(Integer current, Integer size, Long total, Collection<T> records) {
        this.current = current;
        this.size = size;
        this.total = total;
        this.records = records;
    }

}
