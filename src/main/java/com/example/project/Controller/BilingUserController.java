package com.example.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.BilingUser;
import com.example.project.Service.BilingUserService;


@RestController
public class BilingUserController {

	@Autowired
	private BilingUserService bilservice;
	
	
	@CrossOrigin
	@PostMapping("/save-bildata")
	@Transactional
	public String registerBilUser(@RequestBody BilingUser biluser) {
		bilservice.saveBilUser(biluser);
		return "Hello,"+biluser.getFirstname()+"your subscrption is done";	
	}
}
