package com.example.project.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
		
	public User findByUsername(String username);
	
	public User findByUsernameAndPassword(String username,String Password);

}