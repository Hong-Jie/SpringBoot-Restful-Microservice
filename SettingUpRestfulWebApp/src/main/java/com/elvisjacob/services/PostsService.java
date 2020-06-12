package com.elvisjacob.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elvisjacob.entities.Post;
import com.elvisjacob.repositories.PostsRepository;

@Service
public class PostsService {

	@Autowired
	PostsRepository repo;
	
	public List<Post> getPosts(){
		List<Post> list = new ArrayList<>();
		for (Post post: repo.findAll()) {
			list.add(post);
		}
		return list;
	}
	
	public Post getPost(int id) {
		return repo.findById(id).get();
	}

	public void addPost(Post post) {
		repo.save(post);
	}

	public void updatePost(Post post) {
		repo.save(post);
	}

	public void deletePost(int id) {
		repo.deleteById(id);
	}

}
