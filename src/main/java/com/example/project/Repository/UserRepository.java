package com.example.project.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.project.Model.User;

@Repository

public interface UserRepository extends JpaRepository<User,Integer> {
		
	public User findByUsername(String username);
	
	public User findByUsernameAndPasswordAndProfileid(String username,String password,int profileid);
	
//	public User findByProfile(int profile_id);
	
	
	
	public Iterable<User> deleteByUsername(String username);
	
	//@Query("SELECT profile_id FROM User")
	//public List<User> getProfileId();
		
	
}
