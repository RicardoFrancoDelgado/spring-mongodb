package com.springproject.nosql.services;

import com.springproject.nosql.domain.Post;
import com.springproject.nosql.repository.PostRepository;
import com.springproject.nosql.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Post not found!"));
    }

    public List<Post> findByTitle(String text) {
       return repository.findByTitleContainingIgnoreCase(text);
    }
}
