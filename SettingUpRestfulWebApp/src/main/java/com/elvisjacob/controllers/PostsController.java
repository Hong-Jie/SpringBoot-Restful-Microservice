package com.elvisjacob.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elvisjacob.entities.Post;
import com.elvisjacob.services.PostsService;

@RestController
public class PostsController {

	PostsService service = new PostsService();
	
	@RequestMapping("post")
	public List<Post> getPosts() {
		return service.getPosts();
	}
	
	@RequestMapping("post/{id}")
	public Post getPost(@PathVariable int id) {
		return service.getPost(id);
	}
}
