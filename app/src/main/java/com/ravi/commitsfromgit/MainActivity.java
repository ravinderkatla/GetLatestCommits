package com.ravi.commitsfromgit;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ravi.commitsfromgit.adapter.RecyclerViewAdapter;
import com.ravi.commitsfromgit.di.components.ApplicationComponent;
import com.ravi.commitsfromgit.di.components.DaggerMainActivityComponent;
import com.ravi.commitsfromgit.di.components.MainActivityComponent;
import com.ravi.commitsfromgit.di.components.modules.MainActivityContextModule;
import com.ravi.commitsfromgit.di.components.qualifiers.ActivityContext;
import com.ravi.commitsfromgit.di.components.qualifiers.ApplicationContext;
import com.ravi.commitsfromgit.pojo.MyCommits;
import com.ravi.commitsfromgit.retrofit.APIInterface;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity  {

    private RecyclerView recyclerView;
    MainActivityComponent mainActivityComponent;

    @Inject
    public RecyclerViewAdapter recyclerViewAdapter;

    @Inject
    public APIInterface apiInterface;

    @Inject
    @ApplicationContext
    public Context mContext;

    @Inject
    @ActivityContext
    public Context activityContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        ApplicationComponent applicationComponent = MyApplication.get(this).getApplicationComponent();
        mainActivityComponent = DaggerMainActivityComponent.builder()
                .mainActivityContextModule(new MainActivityContextModule(this))
                .applicationComponent(applicationComponent)
                .build();

        mainActivityComponent.injectMainActivity(this);

        recyclerView.setAdapter(recyclerViewAdapter);


        apiInterface.getCommits("ravinderkatla","MyCommitsFromGit").enqueue(new Callback<List<MyCommits>>() {
            @Override
            public void onResponse(Call<List<MyCommits>> call, Response<List<MyCommits>> response) {
                populateRecyclerView(response.body());
            }
            @Override
            public void onFailure(Call<List<MyCommits>> call, Throwable t) {

            }
        });
    }

    private void populateRecyclerView(List<MyCommits> response) {
        recyclerViewAdapter.setData(response);
    }


}