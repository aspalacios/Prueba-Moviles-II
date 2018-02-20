package com.example.abigailpalacios.prueba.models;

/**
 * Created by Abigail Palacios on 20/02/2018.
 */

public class Post {
    private String created_time;
    private String message;
    private String story;
    private String id;

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getId() {
        return id;
    }

    public void setId(String story) {
        this.id = id;
    }
}
