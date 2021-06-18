package com.example.project.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public User loginUser(@RequestBody User user) throws Exception {
		String tempUsername = user.getUsername();
		String temppassword = user.getPassword();
		
		User userObj = null;
		
		if(tempUsername != null && temppassword != null) {
			userObj = service.fetchUserByUsernameAndPassword(tempUsername, temppassword);
		}
		if(userObj == null) {
			throw new Exception ("Bad Credentials");
		}
		return userObj;
	}
	
	@CrossOrigin
	@GetMapping("/all-users")
	@Transactional
	public Iterable<User> showAllUsers() {
		return service.showAllUsers();
	}
	
	@CrossOrigin
	@Transactional
	@GetMapping("/delete/{username}")
	public Iterable<User> deleteUser(@PathVariable String username){
		return service.deleteMyUser(username);
	}
	
	@CrossOrigin
	@GetMapping("/search/{username}")
	public User searchUser(@PathVariable String username) {
		return service.fetchUserByUsername(username);
	}
	
	
	@RequestMapping("/profile")
	public List<User> fetchByProfile_id() {
		return service.fetchByProfile();
	}
	

}
