package com.example.abigailpalacios.prueba.models;

import java.util.List;

/**
 * Created by Abigail Palacios on 20/02/2018.
 */

public class PagePost {
    private List<Post> data;

    public List getPosts() {
        return data;
    }

    public void setPosts(List<Post> data) {
        this.data = data;
    }

}
