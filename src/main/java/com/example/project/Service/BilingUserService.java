package com.example.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.BilingUser;
import com.example.project.Repository.BilingUserRepository;


@Service
public class BilingUserService {
	
	@Autowired
	private BilingUserRepository bilrepo;
	
	public BilingUserService() {}
	
	public BilingUserService(BilingUserRepository bilrepo) {
		super();
		this.bilrepo = bilrepo;
	}
	
	public void saveBilUser(BilingUser biluser) {
		bilrepo.save(biluser);
	}
	
	
	

}
