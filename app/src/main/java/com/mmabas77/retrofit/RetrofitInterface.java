package com.mmabas77.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

  @GET("posts")
    Call<List<Model>>getPosts();
}
