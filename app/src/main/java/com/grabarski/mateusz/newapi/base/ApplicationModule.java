package com.grabarski.mateusz.newapi.base;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private App mApp;

    public ApplicationModule(App app) {
        this.mApp = app;
    }

    @Provides
    @Singleton
    public App provideApplication() {
        return mApp;
    }
}
