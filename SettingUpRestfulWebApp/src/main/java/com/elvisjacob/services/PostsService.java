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
		for (Post post: repo.findAll()) {
			if (post.getPostId() == id) {
				return post;
			}
		}
		return null;
	}
/*
	public void addPost(Post post) {
		posts.add(post);
	}

	public void updatePost(int id, Post newPost) {
		for (int i=0; i<posts.size(); ++i) {
			if (posts.get(i).getPostId() == id) {
				posts.set(i, newPost);
			}
		}
	}

	public void deletePost(int id) {
		for (int i=0; i<posts.size(); ++i) {
			if (posts.get(i).getPostId() == id) {
				posts.remove(i);
			}
		}
	}
*/
}
