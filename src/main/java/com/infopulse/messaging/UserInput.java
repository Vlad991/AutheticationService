package com.infopulse.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface UserInput {

    String INPUT = "user-event-input"; //chanel name

    @Input(INPUT)
    SubscribableChannel input();     //имплементация подставл. автоматически
}