package com.example.weather.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpService {

    private static HttpService s;

    private final static String BASE_ENDPOINT = "http://endpoint.com";

    private Retrofit retro;

    private HttpService() {
        this.retro = new Retrofit.Builder()
                .baseUrl(BASE_ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        s = new HttpService();
    }

    public static HttpService getInstance() {
        return s;
    }
}
