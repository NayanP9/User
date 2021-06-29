package com.example.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.User;
import com.example.project.Service.UserService;



@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@CrossOrigin
	@PostMapping("/save-userss")
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
	@Transactional
	public String reg(@RequestBody User user) {
		return "Added to your cart";
	}

	
}
