package com.example.project.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.Blogs;
import com.example.project.Repository.BlogsRepository;

@Service
public class BlogsService {
	
	@Autowired
	private BlogsRepository blogsrepo;
	
	
	 public BlogsService() {}
	  
	 public BlogsService(BlogsRepository blogsrepo) 
	 { super(); 
	 this.blogsrepo = blogsrepo; 
	 }
	 
	
	public Blogs saveBlog(Blogs blog) {
		return blogsrepo.save(blog);
	}
	
	public List<Blogs> getBlogsByBlogId(String blogtype){
		return blogsrepo.getBlogs(blogtype);
	}
	
	
	public Blogs deleteBlog(int id) {
		return blogsrepo.deleteById(id);
	}
	
	public Blogs fetchBlogById(int id) { 
		  return blogsrepo.findById(id); 
    }
	
	public Blogs updateBlog(Blogs blog) {
		Integer id = blog.getId();
		Blogs blogs = blogsrepo.findById(id).get();
		blogs.setTitle(blog.getTitle());
		blogs.setType(blog.getType());
		blogs.setBody(blog.getBody());
		blogs.setDescription(blog.getDescription());
		return blogsrepo.save(blogs);
	}
}

