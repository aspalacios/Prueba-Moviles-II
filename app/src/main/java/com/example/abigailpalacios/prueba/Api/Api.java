package com.example.abigailpalacios.prueba.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Abigail Palacios on 20/02/2018.
 */

public class Api {
    private final static String URL = "https://graph.facebook.com/v2.12/417487951746202/posts?access_token=EAACEdEose0cBANsWetUY5XSBDWRPT3BJTl1xyk5r4z3ycQWYu9mqnSHrFbern9FVRGOz1hnizZCBCZACFhSoKa4lSBEnT70GqnTKK8sCaZA5KZBXMomk5uoYF5sRefGi33uNEevaBd8jVH7IZAmXqPUiYLbUevjqAbw8cpyMy88NyqkpPQKJ2xJNE3ghKagZAbClVRHhvnRx1AvMLsFOzGsZAvpGa81uFEZD&debug=all&format=json&method=get&pretty=0&suppress_http_code=1";

    public static ApiInterface instance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ApiInterface.class);
    }
}
