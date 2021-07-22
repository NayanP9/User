package com.example.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.Campaign;
import com.example.project.Repository.CampaignRepository;
import com.example.project.Service.CampaignService;



@RestController
public class CampaignController {
	@Autowired
	private CampaignService campservice;
	
	@Autowired
	private CampaignRepository camprepo;
	
	
	@CrossOrigin
	@PostMapping("/saveoffer")
	@Transactional
	public String registerCampUser(@RequestBody Campaign campuser) {
		campservice.saveCampUser(campuser);
		return "your,"+campuser.getFestivalname()+"is set active";	
	}
	
	//LIST ALL THE USER FROM THE DATABASE
	@CrossOrigin
	@GetMapping("/all-offers")
	@Transactional
	public Iterable<Campaign> showAllOffers() {
		return campservice.getAllOffers();
	}
	
	//DELETE THE USER FROM THE DATABASE USING ID
	@CrossOrigin
	@Transactional
	@DeleteMapping("/deletecamp/{festivalid}")
	public Iterable<Campaign> deleteByID(@PathVariable int festivalid){
		return camprepo.deleteByFestivalid(festivalid);
	}
	
	
	//Update Campaign with the fest id :- not used 
	@CrossOrigin
	@PutMapping("/update-campaign/{festivalid}")
	@Transactional
	public ResponseEntity<Campaign> UpdateCampaign1(@PathVariable(value="festivalid") int festivalid, @RequestBody Campaign campaign) {
			
		 Campaign campaign1 = camprepo.getById(festivalid);
		 campaign1.setFestivalname(campaign.getFestivalname());
		 campaign1.setStartdate(campaign.getStartdate());
		 campaign1.setEnddate(campaign.getEnddate());
		 campaign1.setOffer(campaign.getOffer());
		 campaign1.setStatus(campaign.getStatus());
		 final Campaign updatedCampaign = camprepo.save(campaign);
		 return ResponseEntity.ok(updatedCampaign);
		 
		
	}
	
	//Update campaign
	
	@CrossOrigin
	@PutMapping("/update-campaign2")
	@Transactional
	public Campaign updateCampign2(@RequestBody Campaign campaign){
		return campservice.saveCampUser1(campaign);
		
	}
	
	//Native Query for getting the active results
	@CrossOrigin
	@GetMapping("/test")
	@Transactional
	public List<Campaign> testCamp(){
		return camprepo.getCamp();
	}
	
	
	

}
