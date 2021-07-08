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

import com.example.project.Model.Magazine;
import com.example.project.Service.MagazineService;


@RestController

public class MagazineController {
	
	@Autowired
	
	private MagazineService magservice;
	
	
	@CrossOrigin
	@PostMapping("/savemag")
	@Transactional
	public String registerMagazine(@RequestBody Magazine magazine) {
		magservice.saveMag(magazine);
		return "Hello,"+magazine.getMagname()+"your registration is done";	
	}
	
	@CrossOrigin
	@GetMapping("/all-magazines")
	@Transactional
	public Iterable<Magazine> getMagazines() {
		return magservice.getAllMagazines();
	}

	@CrossOrigin
	@Transactional
	@DeleteMapping("/deletemag/{magid}")
	public Iterable<Magazine> deleteMagazine(@PathVariable int magid){
		return magservice.deleteMagazine(magid);
	}
	

}