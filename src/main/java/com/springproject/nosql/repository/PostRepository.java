package com.springproject.nosql.repository;

import com.springproject.nosql.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
