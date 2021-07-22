package com.example.project.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.Campaign;
import com.example.project.Repository.CampaignsRepository;
import com.example.project.Service.CampaignUserService;



@RestController
public class CampaignUserController {
	@Autowired
	private CampaignUserService campservice;
	
	@Autowired
	private CampaignsRepository camprepo;
	
	
	@CrossOrigin
	@PostMapping("/save-camp")
	@Transactional
	public String registerCampUser(@RequestBody Campaign campuser) {
		campservice.saveCampUser(campuser);
		return "your,"+campuser.getFestname()+"is set active";	
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
	@DeleteMapping("/deletecamp/{festid}")
	public Iterable<Campaign> deleteByID(@PathVariable int festid){
		return camprepo.deleteByFestid(festid);
	}
	
	
	//Update Campaign with the fest id :- not used 
	@CrossOrigin
	@PutMapping("/update-campaign/{festid}")
	@Transactional
	public ResponseEntity<Campaign> UpdateCampaign1(@PathVariable(value="festid") int festid, @RequestBody Campaign campaign) {
			
		 Campaign campaign1 = camprepo.getById(festid);
		 campaign1.setFestname(campaign.getFestname());
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
