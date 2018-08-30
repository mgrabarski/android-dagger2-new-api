package com.grabarski.mateusz.newapi.base;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        ApplicationModule.class
})
public interface ApplicationComponent {
    void inject(App app);
}
