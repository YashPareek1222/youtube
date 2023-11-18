package com.yash.youtube.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.yash.youtube.model.User;

public interface UserRepository extends MongoRepository<User, String>{
    
}
