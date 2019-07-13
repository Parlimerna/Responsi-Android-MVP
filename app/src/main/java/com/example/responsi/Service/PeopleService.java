package com.example.responsi.Service;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface PeopleService {

    @GET("people")
    Call<Response> getData();
}
