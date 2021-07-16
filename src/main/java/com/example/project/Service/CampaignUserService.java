package com.example.project.Service;

import java.util.ArrayList;
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
	public List<Campaign> showAllCamp(){
		List<Campaign> campusers = new ArrayList<Campaign>();
		for(Campaign campuser : camprepo.findAll()) {
			campusers.add(campuser);
		}
		
		return campusers;
	}


	public Iterable<Campaign> deleteCamp(String festname) {
	return  (List<Campaign>) camprepo.deleteByFestname(festname);
	}

	
}
