package com.example.api.repository;

import com.example.api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserRepository extends MongoRepository<User, String> {

    @Query(value = "{userName:'?0'}")
    User findUserByUsername(String username);
}
