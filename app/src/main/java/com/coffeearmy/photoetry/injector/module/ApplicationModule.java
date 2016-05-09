package com.coffeearmy.photoetry.injector.module;

import android.content.Context;
import com.coffeearmy.photoetry.AndroidApplication;
import dagger.Provides;

import javax.inject.Singleton;

public class ApplicationModule {

    private final AndroidApplication application;

    public ApplicationModule(AndroidApplication application) {
        this.application = application;
    }

    // provide dependencies
    @Provides
    @Singleton
    Context provideContext() {
        return application;
    }

    @Provides
    @Singleton



}

//    @Provides
//    @Singleton
//    ThreadExecutor provideThreadExecutor() {
//        return JobExecutor.getInstance();
//    }
//
//    @Provides
//    @Singleton
//    PostExecutionThread providePostExecutionThread() {
//        return UIThread.getInstance();
//    }
//}
