package com.grabarski.mateusz.newapi.services;

import dagger.Component;

@Component(modules = {
        MessageModule.class
})
public interface MessageComponent {
    MessageService messageService();
}
