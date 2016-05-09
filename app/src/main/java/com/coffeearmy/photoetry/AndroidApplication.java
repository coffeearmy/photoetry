package com.coffeearmy.photoetry;

import android.app.Application;
import com.coffeearmy.photoetry.injector.component.ApplicationComponent;
import com.coffeearmy.photoetry.injector.module.ApplicationModule;

public class AndroidApplication extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();
    }

    private void initializeInjector() {
        component = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
