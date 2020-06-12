package com.elvisjacob.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Post {
	@Id
	@Column(name="post_id")
	private int postId;
	@Column(name="type")
	private String type;
	@Column(name="text")
	private String text;
	
	public Post() {
	}

	public Post(int postId, String type, String text) {
		this.postId = postId;
		this.type = type;
		this.text = text;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", type=" + type + ", text=" + text + "]";
	}
	
}
