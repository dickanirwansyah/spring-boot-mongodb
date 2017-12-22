package com.github.mongodb.springbootmongodb.repository;

import com.github.mongodb.springbootmongodb.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer>{
}
