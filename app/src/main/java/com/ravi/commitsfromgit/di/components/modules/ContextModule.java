package com.ravi.commitsfromgit.di.components.modules;

import android.content.Context;


import com.ravi.commitsfromgit.di.components.ApplicationScope;
import com.ravi.commitsfromgit.di.components.qualifiers.ApplicationContext;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationScope
    @ApplicationContext
    public Context provideContext() {
        return context;
    }
}
