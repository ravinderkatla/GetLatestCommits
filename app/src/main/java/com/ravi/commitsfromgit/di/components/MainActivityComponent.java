package com.ravi.commitsfromgit.di.components;


import android.content.Context;

import com.ravi.commitsfromgit.MainActivity;
import com.ravi.commitsfromgit.di.components.modules.AdapterModule;
import com.ravi.commitsfromgit.di.components.qualifiers.ActivityContext;

import dagger.Component;


@ActivityScope
@Component(modules = AdapterModule.class, dependencies = ApplicationComponent.class)
public interface MainActivityComponent {

    @ActivityContext
    Context getContext();


    void injectMainActivity(MainActivity mainActivity);
}
