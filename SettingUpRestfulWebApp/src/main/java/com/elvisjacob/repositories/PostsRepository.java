package com.elvisjacob.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elvisjacob.entities.Post;

@Repository
public interface PostsRepository extends CrudRepository<Post, Integer>{

}
