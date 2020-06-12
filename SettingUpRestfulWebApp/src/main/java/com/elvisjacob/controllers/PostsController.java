package com.elvisjacob.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elvisjacob.entities.Post;
import com.elvisjacob.services.PostsService;

@RestController
public class PostsController {

	@Autowired
	PostsService service;
	
	@RequestMapping("post")
	public List<Post> getPosts() {
		return service.getPosts();
	}
	
	@RequestMapping("post/{id}")
	public Post getPost(@PathVariable int id) {
		return service.getPost(id);
	}
/*	
	@RequestMapping(value="post", method=RequestMethod.POST)
	public void addPost(@RequestBody Post post) {
		service.addPost(post);
	}
	
	@RequestMapping(value="post/{id}", method=RequestMethod.PUT)
	public void updatePost(@PathVariable int id, @RequestBody Post post) {
		service.updatePost(id, post);
	}
	
	@RequestMapping(value="post/{id}", method=RequestMethod.DELETE)
	public void deletePost(@PathVariable int id) {
		service.deletePost(id);
	}
*/
}
