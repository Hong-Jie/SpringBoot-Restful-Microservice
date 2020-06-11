package com.elvisjacob.API;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListEntities {

	@RequestMapping("listblogs")
	public String listBlogs() {
		return "listBlogs";
	}
}
