package com.example.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.CardUser;
import com.example.project.Repository.CardUserRepository;

@Service
public class CardUserService {
	
	@Autowired
	private CardUserRepository cardrepo;
	
	public CardUserService() {}
	
	public CardUserService(CardUserRepository cardrepo) {
		super();
		this.cardrepo = cardrepo;
	}
	
	public void saveBilUser(CardUser carduser) {
		cardrepo.save(carduser);
	}

}
