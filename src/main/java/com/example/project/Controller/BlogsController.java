package com.example.project.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.Blogs;
import com.example.project.Service.BlogsService;


@RestController
public class BlogsController {
	
	@Autowired
	private BlogsService blogservice;
		
	@CrossOrigin
	@PostMapping("/save-blog")
	@Transactional
	public String blogData(@RequestBody Blogs blog) {
		blogservice.saveBlog(blog);
		return "Blog is submitted";	
	}
	
	@CrossOrigin
	@GetMapping("/all")
	@Transactional
	public Iterable<Blogs> getBlogs(@RequestParam String blogtype) {
		return blogservice.getBlogsByBlogId(blogtype);
	}
	
	
	@CrossOrigin
	@Transactional
	@GetMapping("/deleteblog/{id}")
	public Blogs deleteBlog(@PathVariable int id){
		return blogservice.deleteBlog(id);
	}
	
	@CrossOrigin
	@PutMapping("/updateblog")
	public Blogs updateBlog(@RequestBody Blogs blog) {
		return blogservice.updateBlog(blog);
}
}


