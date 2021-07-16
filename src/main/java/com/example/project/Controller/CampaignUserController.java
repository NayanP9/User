package com.example.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.Campaign;

import com.example.project.Service.CampaignUserService;



@RestController
public class CampaignUserController {
	@Autowired
	private CampaignUserService campservice;
	
	
	@CrossOrigin
	@PostMapping("/save-camp")
	@Transactional
	public String registerCampUser(@RequestBody Campaign campuser) {
		campservice.saveCampUser(campuser);
		return "your,"+campuser.getFestname()+"is set active";	
	}
	@CrossOrigin
	@GetMapping("/all-camp")
	@Transactional
	public Iterable<Campaign> showAllCamp() {
		return campservice.showAllCamp();
	}
	@CrossOrigin
	@Transactional
	@DeleteMapping("/deletecamp/{festname}")
	public Iterable<Campaign> deleteCamp(@PathVariable String festname){
		return campservice.deleteCamp(festname);
}
}
