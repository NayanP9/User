package com.example.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.Mazine;
import com.example.project.Repository.MazineUserRepository;

import java.util.*;


@Service
public class MazineUserService {
	
	@Autowired
	private MazineUserRepository magrepo;

	public MazineUserService() {}
	
	public MazineUserService(MazineUserRepository magrepo) {
		super();
		this.magrepo = magrepo;
	}
	
	public void saveMyMagUser(Mazine maguser) {
		magrepo.save(maguser);
	}
	
	public List<Mazine> showAllUsers(){
		List<Mazine> magusers = new ArrayList<Mazine>();
		for(Mazine maguser : magrepo.findAll()) {
			magusers.add(maguser);
		}
		
		return magusers;
	}
//	public List<Mazine>deleteMyUser(String mag_name) {
//		return (List<Mazine>) magrepo.deleteBymagname(mag_name);
//	}
	

}
