package com.ravi.commitsfromgit.di.components.modules;


import com.ravi.commitsfromgit.MainActivity;
import com.ravi.commitsfromgit.adapter.RecyclerViewAdapter;
import com.ravi.commitsfromgit.di.components.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module(includes = {MainActivityContextModule.class})
public class AdapterModule {

    @Provides
    @ActivityScope
    public RecyclerViewAdapter getStarWarsPeopleLIst() {
        return new RecyclerViewAdapter();
    }


}
