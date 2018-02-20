package com.example.abigailpalacios.prueba.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abigailpalacios.prueba.R;
import java.util.List;

import com.example.abigailpalacios.prueba.models.PagePost;
import com.example.abigailpalacios.prueba.models.Post;

/**
 * Created by Abigail Palacios on 20/02/2018.
 */

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    List<Post> posts;

    public PostAdapter(PagePost pagePosts) {
        pagePosts.getPosts();
    }

    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostAdapter.ViewHolder holder, int position) {
        Post post = posts.get(position);

        holder.created_time.setText(post.getCreated_time());
        holder.message.setText(post.getMessage());
        holder.story.setText(post.getStory());
        holder.id.setText(post.getId());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView created_time;
        TextView message;
        TextView story;
        TextView id;

        public ViewHolder(View itemView) {
            super(itemView);

            created_time = itemView.findViewById(R.id.created_time);
            message = itemView.findViewById(R.id.message);
            story = itemView.findViewById(R.id.story);
            id = itemView.findViewById(R.id.id);
        }
    }

}
