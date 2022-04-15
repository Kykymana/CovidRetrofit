package com.example.covidretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface CovidInfoService {
    @GET("history")
    @Headers({
            "X-RapidAPI-Host", "covid-193.p.rapidapi.com",
            "X-RapidAPI-Key", "6003eea507mshe401aafc292513cp1dc9f6jsnb85ffdd23c2c",
    })
    Call<CovidHistory> covidHistory(@Query("country") String country, @Query("day") String day);
}
