package com.example.project.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.project.Model.Magazine;
import com.example.project.Service.MagazineService;


@RestController

public class MagazineController {
	
	@Autowired
	
	private MagazineService magservice;
	
	
	/*
	 * @CrossOrigin
	 * 
	 * @PostMapping("/savemag")
	 * 
	 * @Transactional public String registerMagazine(@RequestParam("file")
	 * MultipartFile file) throws Exception{ Magazine magazine = new Magazine();
	 * magazine.setCoverimage(file.getBytes()); magservice.saveMag(magazine); return
	 * "Hello,"+magazine.getMagname()+"your registration is done"; }
	 */

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
	
	/*
	 * @CrossOrigin
	 * 
	 * @Transactional
	 * 
	 * @GetMapping("/get/{coverimage}") public Magazine
	 * getImage(@PathVariable("coverimage") byte[] coverimage) { return
	 * magservice.findImage(coverimage); }
	 * 
	 * 
	 * @CrossOrigin
	 * 
	 * @Transactional
	 * 
	 * @PostMapping("/upload") public Magazine
	 * uploadImage(@RequestParam("coverimage") byte[] coverimage) { return
	 * magservice.saveImage(coverimage); }
	 */
	 
}