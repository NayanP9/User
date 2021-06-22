package com.example.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
	
	  @CrossOrigin
	  
	  @PostMapping("/login")
	  
	  @Transactional 
	  public User loginUser(@RequestBody User user) throws Exception{
	  String tempUsername = user.getUsername(); 
	  String temppassword = user.getPassword();
	 
	  User userObj = null;
	  
	  if(tempUsername != null && temppassword != null) { 
		  userObj = service.fetchUserByUsernameAndPassword(tempUsername, temppassword); 
		  }
	  if(userObj == null) { throw new Exception ("Bad Credentials"); 
	  } return userObj; 
	  }
	  
	  @CrossOrigin
	  
	  @GetMapping
	   public User userPid(@RequestBody User user)throws Exception{
	   int tempPid = user.getPid(); 
	   User userObj = null;
	  
	  if(tempPid != 0) { 
		  userObj = service.fetchUserByPid(tempPid); 
		  } return userObj;
	   }
	 
	
	
	/*
	 * @CrossOrigin
	 * 
	 * @PostMapping("/login")
	 * 
	 * @Transactional public User loginUserr(@RequestBody User user) throws
	 * Exception { String tempUsername = user.getUsername(); String temppassword =
	 * user.getPassword(); int tempPid = user.getPid();
	 * 
	 * User userObj = null;
	 * 
	 * if(tempUsername != null && temppassword != null && tempPid != 0) { userObj =
	 * service.fetchUserByNamePassAndPid(tempUsername, temppassword, tempPid); }
	 * if(userObj == null) { throw new Exception ("Bad Credentials"); } return
	 * userObj; }
	 */
	
}
