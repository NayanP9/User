package com.example.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.Campaign;

import com.example.project.Repository.CampaignRepository;


@Service
public class CampaignService {
	@Autowired
	private CampaignRepository camprepo;
	
	public CampaignService() {}
	
	public CampaignService(CampaignRepository camprepo) {
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
