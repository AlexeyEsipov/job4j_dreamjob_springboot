package ru.job4j.dreamjob.service;

import org.springframework.stereotype.Service;
import javax.annotation.concurrent.ThreadSafe;
import ru.job4j.dreamjob.model.Post;
import ru.job4j.dreamjob.store.PostDBStore;

import java.util.Collection;

@ThreadSafe
@Service
public class PostService {

    private final PostDBStore store;

    public PostService(PostDBStore store) {
        this.store = store;
    }

    public void add(Post post) {
        store.add(post);
    }

    public Post findById(int id) {
        return store.findById(id);
    }

    public void update(Post post) {
        store.update(post);
    }

    public Collection<Post> findAll() {
        return store.findAll();
    }

    public Collection<Post> findAllVisible() {
        return store.findAllVisible();
    }

    public void delete(int id) {
        store.delete(id);
    }
}
