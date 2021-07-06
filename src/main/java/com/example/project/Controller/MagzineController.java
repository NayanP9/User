package com.example.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.Mazine;
import com.example.project.Service.MazineUserService;


@RestController

public class MagzineController {
	
	@Autowired
	
	private MazineUserService magservice;
	
	
	@CrossOrigin
	@PostMapping("/save-maz")
	@Transactional
	public String registerEmployee(@RequestBody Mazine maguser) {
		magservice.saveMyMagUser(maguser);
		return "Hello,"+maguser.getMag_name()+"your registration is done";	
	}
	
	@CrossOrigin
	@GetMapping("/all-magusers")
	@Transactional
	public Iterable<Mazine> showAllUsers() {
		return magservice.showAllUsers();
	}

	
	@Transactional
	@DeleteMapping("/deletemag/{magname}")
	public Iterable<Mazine> deleteMazine(@PathVariable String magname){
		return magservice.deleteMyUser(magname);
	}
	

}
