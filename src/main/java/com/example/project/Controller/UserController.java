package com.example.project.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.User;
import com.example.project.Service.UserService;



@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@CrossOrigin
	@PostMapping("/save-user")
	@Transactional
	public String registerEmployee(@RequestBody User user) {
		service.saveMyUser(user);
		return "Hello,"+user.getUsername()+"your registration is done";	
	}
	
	
	@CrossOrigin
	@PostMapping("/login")
	@Transactional
	public User loginUser(@RequestBody User u) throws Exception {
		String tempUsername = u.getUsername();
		String temppassword = u.getPassword();
		int tempprofileid = u.getProfileid();
		
		
		
	
		
		
		User user = null;
		
		if(tempUsername != null && temppassword != null && tempprofileid != 9) {
			user = service.fetchUserByUsernameAndPasswordAndProfileid(tempUsername, temppassword, tempprofileid);
		}
		else if(user == null) {
			throw new Exception ("Bad Credentials");
		}
//		if(user!=null){
//			if(user.getProfile_id()==1) {
//				user.setProfileName("Customer");
//			}
//			if(user.getProfile_id()==2) {
//				user.setProfileName("Employee");
//			}
//			
//			if(user.getProfile_id()==3) {
//				user.setProfileName("Artist");
//			}
//		
//		}
		System.out.println(user + tempUsername + tempprofileid );
		return user;
		
	}
	
	

	
	@CrossOrigin
	@GetMapping("/all-users")
	@Transactional
	public Iterable<User> showAllUsers() {
		return service.showAllUsers();
	}
	
	@CrossOrigin
	@Transactional
	@DeleteMapping("/delete/{username}")
	public Iterable<User> deleteUser(@PathVariable String username){
		return service.deleteMyUser(username);
	}
	
	@CrossOrigin
	@GetMapping("/search/{username}")
	public User searchUser(@PathVariable String username) {
		return service.fetchUserByUsername(username);
	}
	
	


}
