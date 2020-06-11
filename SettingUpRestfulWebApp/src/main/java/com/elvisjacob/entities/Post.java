package com.elvisjacob.entities;

public class Post {
	private int postId;
	private String type, text;
	
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
