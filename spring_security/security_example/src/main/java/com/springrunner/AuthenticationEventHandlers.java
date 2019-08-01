package com.springrunner;

import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationEventHandlers {

    @EventListener
    public void handlerBadCredential(AuthenticationFailureBadCredentialsEvent event) {
        System.out.println(event.getAuthentication().getPrincipal() + " 인증시도중");
        System.out.println("비번이 틀렸습니다");
    }
}
