package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.Campaign;

import com.example.project.Repository.CampaignsRepository;


@Service
public class CampaignUserService {
	@Autowired
	private CampaignsRepository camprepo;
	
	public CampaignUserService() {}
	
	public CampaignUserService(CampaignsRepository camprepo) {
		super();
		this.camprepo = camprepo;
	}
	
	public void saveCampUser(Campaign campuser) {
		camprepo.save(campuser);
	}
	
	public List<Campaign> getAllOffers() {
		return camprepo.findAll();
	}
	
	public Campaign saveCampUser1(Campaign campuser) {
		
		return camprepo.save(campuser);
		
	}
	
	


	
	 	
	
}
