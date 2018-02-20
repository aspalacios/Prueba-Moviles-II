package com.example.abigailpalacios.prueba.Api;

import com.example.abigailpalacios.prueba.models.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Abigail Palacios on 20/02/2018.
 */

public interface ApiInterface {
    @GET("/")
    Call<List<Post>> getPosts();
}
