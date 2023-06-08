package com.example.tugas_praktikum_7.api;

import com.example.tugas_praktikum_7.models.UserResponse;
import com.example.tugas_praktikum_7.models.UsersResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("api/users")
    Call<UsersResponse> getListUsers(@Query("page") int page, @Query("per_page") int perPage);

    @GET("api/users/{id}")
    Call<UserResponse> getUser(@Path("id") int id);
}