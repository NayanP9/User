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
		/*
		 * List<Blogs> blog = new ArrayList<Blogs>(); for(Blogs blogs :
		 * blogsrepo.findAll()) { blog.add(blogs); }
		 * 
		 * return blog;
		 */
	}
	
	
	public Blogs deleteBlog(int id) {
		return blogsrepo.deleteById(id);
	}
}

