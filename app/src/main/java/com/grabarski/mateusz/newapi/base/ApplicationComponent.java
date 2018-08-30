package com.grabarski.mateusz.newapi.base;

import com.grabarski.mateusz.newapi.ui.MainActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        ApplicationModule.class,
        MainActivityModule.class
})
public interface ApplicationComponent {
    void inject(App app);
}
