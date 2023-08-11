package com.nunesdc.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nunesdc.workshopmongodb.domain.Post;
import com.nunesdc.workshopmongodb.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
