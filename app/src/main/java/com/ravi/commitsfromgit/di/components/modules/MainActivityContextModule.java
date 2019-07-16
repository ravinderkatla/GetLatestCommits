package com.ravi.commitsfromgit.di.components.modules;


import android.content.Context;

import com.ravi.commitsfromgit.MainActivity;
import com.ravi.commitsfromgit.di.components.ActivityScope;
import com.ravi.commitsfromgit.di.components.qualifiers.ActivityContext;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityContextModule {
    private MainActivity mainActivity;

    public Context context;

    public MainActivityContextModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        context = mainActivity;
    }

    @Provides
    @ActivityScope
    public MainActivity providesMainActivity() {
        return mainActivity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public Context provideContext() {
        return context;
    }

}
