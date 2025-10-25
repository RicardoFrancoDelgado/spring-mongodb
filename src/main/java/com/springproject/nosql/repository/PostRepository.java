package com.springproject.nosql.repository;

import com.springproject.nosql.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTitleContainingIgnoreCase(String text); // a declaração faz com o que o spring monte a consulta para a aplicação

    @Query("{ 'title': {$regex: ?0, $options: 'i' } }")
    List<Post> searchTitle(String text);
}
