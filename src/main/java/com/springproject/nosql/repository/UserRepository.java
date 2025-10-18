package com.springproject.nosql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springproject.nosql.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
