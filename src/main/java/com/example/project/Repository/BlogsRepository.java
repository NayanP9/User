package com.example.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.project.Model.Blogs;

@Repository
public interface BlogsRepository extends CrudRepository<Blogs,Integer> {
	
	@Query(value="SELECT * FROM blog WHERE blogtype = :blogtype ", nativeQuery=true)
	public List<Blogs> getBlogs(@Param ("blogtype") String blogtype);
	
	public Blogs deleteById(int id);
	
	public Blogs findById(int id);

}
