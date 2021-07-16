package com.example.project.Repository;


//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import java.util.*;
import org.springframework.stereotype.Repository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.*;

//import java.util.List;
//import java.util.Optional;


import com.example.project.Model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
		
	public User findByUsername(String username);
	
	public User findByUsernameAndPassword(String username,String Password);
	
	public User findByProfileid(int profileid);
	
	public Iterable<User> deleteByUsername(String username);

	
	

//	@Query("SELECT profile_id FROM usertable")
//	public List<User> getProfileId();
}
