package ru.job4j.gc.leak;

import ru.job4j.gc.leak.models.Post;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PostStore {

    private final Map<Integer, Post> posts = new HashMap<>();

    private int ids = 1;

    public Post add(Post post) {
        ids++;
        post.setId(ids);
        posts.put(ids, post);
        return post;
    }

    public void removeAll() {
        posts.clear();
    }

    public Collection<Post> getPosts() {
        return posts.values();
    }
}