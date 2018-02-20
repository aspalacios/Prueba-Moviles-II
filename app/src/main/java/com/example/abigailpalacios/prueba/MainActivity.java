package com.example.abigailpalacios.prueba;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.abigailpalacios.prueba.Api.Api;
import com.example.abigailpalacios.prueba.adapters.PostAdapter;
import com.example.abigailpalacios.prueba.models.PagePost;
import com.example.abigailpalacios.prueba.models.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        configureRecyclerView();
        fetchHttpRequest();
    }
    private void initViews() {
        recyclerView = findViewById(R.id.recycler_view);
    }

    /**
     * To configure the RecyclerView
     */
    private void configureRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

    /**
     * To make an http request
     */
    private void fetchHttpRequest() {
        Call<List<Post>> call = Api.instance().getPosts();
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(@NonNull Call<List<Post>> call, Response<List<Post>> response) {
                if (response.body() != null) {
                    PostAdapter postAdapter = new PostAdapter(response.body());
                    recyclerView.setAdapter(postAdapter);
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<Post>> call, @NonNull Throwable t) {
                Log.i("Debug: ", t.getMessage());
            }
        });
    }
}
