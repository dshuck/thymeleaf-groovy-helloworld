package com.daveshuck.thymeleafhello

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.ApplicationListener
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.event.ContextStartedEvent

/**
 * Created by B027906 on 3/27/14.
 */

@EnableAutoConfiguration
@ComponentScan
class Application implements ApplicationListener<ContextStartedEvent> {
    static void main(String[] args) {
        SpringApplication.run(Application.class, args)

        println 'This sucka actually started!'
    }

    void onApplicationEvent(ContextStartedEvent event) {
    }
}
