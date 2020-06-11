package com.elvisjacob.services;

import java.util.ArrayList;
import java.util.List;

import com.elvisjacob.entities.Post;

public class PostsService {

	List<Post> posts = new ArrayList<Post>();

	public PostsService() {
		posts.add(new Post(1, "DataType", "Sample text"));
		posts.add(new Post(2, "Class", "Sample text"));
		posts.add(new Post(3, "Object", "Sample text"));
		posts.add(new Post(4, "Access", "Sample text"));
		posts.add(new Post(5, "OOP", "Sample text"));
	}
	
	public List<Post> getPosts(){
		return posts;
	}
	
	public Post getPost(int id) {
		for (Post post: posts) {
			if (post.getPostId() == id) {
				return post;
			}
		}
		return null;
	}
}
