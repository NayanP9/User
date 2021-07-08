package com.example.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.Magazine;
import com.example.project.Repository.MagazineRepository;

import java.util.*;


@Service
public class MagazineService {
	
	@Autowired
	private MagazineRepository magrepo;

	public MagazineService() {}
	
	public MagazineService(MagazineRepository magrepo) {
		super();
		this.magrepo = magrepo;
	}
	
	public void saveMag(Magazine magazine) {
		magrepo.save(magazine);
	}
	
	public List<Magazine> getAllMagazines(){
		List<Magazine> magazine = new ArrayList<Magazine>();
		for(Magazine maguser : magrepo.findAll()) {
			magazine.add(maguser);
		}
		
		return magazine;
	}
	
	public List<Magazine> deleteMagazine(int magid) {
	return  (List<Magazine>) magrepo.deleteByMagid(magid);
	}	

}