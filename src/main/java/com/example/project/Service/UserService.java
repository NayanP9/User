package com.example.project.Service;

import java.util.*;

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
		return userrepo.findByUsernameAndPassword(username, Password);
	}
	
	public List<User> showAllUsers(){
		List<User> users = new ArrayList<User>();
		for(User user : userrepo.findAll()) {
			users.add(user);
		}
		
		return users;
	}
	
//	public List<User>deleteMyUser(String username) {
//		return (List<User>) userrepo.deleteByUsername(username);
//	}
//	
//    public   List<User>  fetchByProfile() {
//    	//return (List<User>) userrepo.getProfileId();
//    	List<User> alluser = userrepo.getProfileId();
//        
//        alluser.forEach(e->{System.out.println(e);
//        
//       });
//		return null;
//    }
}
