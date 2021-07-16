package com.example.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.Blogs;
import com.example.project.Service.BlogsService;


@RestController
public class BlogsController {
	
	@Autowired
	private BlogsService service;
		
	@CrossOrigin
	@PostMapping("/save-blog")
	@Transactional
	public String blogData(@RequestBody Blogs blog) {
		service.saveBlog(blog);
		return "Blog is submitted";	
	}
	
	@CrossOrigin
	@GetMapping("/all")
	@Transactional
	public Iterable<Blogs> getBlogs(@RequestParam String blogtype) {
		return service.getBlogsByBlogId(blogtype);
	}
	
	
	@CrossOrigin
	@Transactional
	@GetMapping("/deleteblog/{id}")
	public Blogs deleteBlog(@PathVariable int id){
		return service.deleteBlog(id);
	}
	
}


