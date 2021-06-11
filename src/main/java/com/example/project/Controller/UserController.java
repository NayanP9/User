package com.example.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	@PostMapping("/save-user")
	@Transactional
	public String registerEmployee(@RequestBody User user) {
		service.saveMyUser(user);
		return "Hello,"+user.getUsername()+"your registration is done";	
	}

}
