package com.yash.youtube.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yash.youtube.model.Video;

public interface VideoRepository extends MongoRepository<Video, String>{
    
}
