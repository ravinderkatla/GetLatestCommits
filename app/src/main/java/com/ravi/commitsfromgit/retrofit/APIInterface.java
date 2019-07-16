package com.ravi.commitsfromgit.retrofit;


import com.ravi.commitsfromgit.pojo.MyCommits;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface APIInterface {


    @GET("repos/{owner}/{repo}/commits")
    Call<List<MyCommits>> getCommits(@Path("owner") String owner, @Path("repo") String repo);


}