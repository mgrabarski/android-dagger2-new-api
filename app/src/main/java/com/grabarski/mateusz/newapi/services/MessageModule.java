package com.grabarski.mateusz.newapi.services;

import dagger.Module;
import dagger.Provides;

@Module
public class MessageModule {

    @Provides
    public MessageService provideMessageService() {
        return new MessageServiceImpl();
    }
}
