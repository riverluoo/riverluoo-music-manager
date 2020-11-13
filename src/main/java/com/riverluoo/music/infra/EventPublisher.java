package com.riverluoo.music.infra;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EventPublisher {
    private final ApplicationContext applicationContext;

    public void publishEvent(Object event) {
        applicationContext.publishEvent(event);
    }
}
