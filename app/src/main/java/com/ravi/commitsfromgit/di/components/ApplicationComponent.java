package com.ravi.commitsfromgit.di.components;

import android.content.Context;

import com.ravi.commitsfromgit.MyApplication;
import com.ravi.commitsfromgit.di.components.modules.ContextModule;
import com.ravi.commitsfromgit.di.components.modules.RetrofitModule;
import com.ravi.commitsfromgit.di.components.qualifiers.ApplicationContext;
import com.ravi.commitsfromgit.retrofit.APIInterface;

import dagger.Component;

@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {

    public APIInterface getApiInterface();

    @ApplicationContext
    public Context getContext();

    public void injectApplication(MyApplication myApplication);
}

