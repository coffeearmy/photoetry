package com.coffeearmy.photoetry.injector.component;

import com.coffeearmy.photoetry.injector.module.ApplicationModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component( modules= ApplicationModule.class)
public interface ApplicationComponent {

    void inject(BaseActivity baseActivity);


}
