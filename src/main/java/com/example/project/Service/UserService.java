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
	
	
	  public User fetchUserByUsernameAndPassword(String username,String Password) {
	  return userrepo.findByUsernameAndPassword(username, Password); }
	  
	  public User fetchUserByPid(int pid) { 
		  return userrepo.findByPid(pid); 
      }
	  
	  public List<User> showAllUsers(){
			List<User> users = new ArrayList<User>();
			for(User user : userrepo.findAll()) {
				users.add(user);
			}
			
			return users;
		}
		
		public List<User>deleteUser(String username) {
			return (List<User>) userrepo.deleteByUsername(username);
		}
	 
    
		/*
		 * public User fetchUserByNamePassAndPid(String username,String Password, int
		 * pid) { return userrepo.findByNamePassAndPid(username, Password, pid); }
		 */

}
