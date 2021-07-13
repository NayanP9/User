package com.example.project.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.User;
import com.example.project.Repository.UserRepository;



@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepo;
	
	public UserService() {}
	
	public UserService(UserRepository userrepo) {
		super();
		this.userrepo = userrepo;
	}
	
	public void saveMyUser(User user) {
		userrepo.save(user);
	}
	
	public User fetchUserByUsername(String username) {
		return userrepo.findByUsername(username);
	}
	
	public User fetchUserByUsernameAndPassword(String username,String password) {
		return userrepo.findByUsernameAndPassword(username, password);
	}
	
	public User fetchUserByProfileid(int profileid) {
		return userrepo.findByProfileid(profileid);	
	}
	

	
	
	
	
	public List<User> showAllUsers(){
		List<User> users = new ArrayList<User>();
		for(User user : userrepo.findAll()) {
			users.add(user);
		}
		
		return users;
	}
	
	public List<User>deleteMyUser(String username) {
		return (List<User>) userrepo.deleteByUsername(username);
	}
	

		
    
   
	
	
	
	
	

}
