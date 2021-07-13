package com.example.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.project.Model.CardUser;
import com.example.project.Service.CardUserService;

@RestController
public class CardUserController {
	
	@Autowired
	private CardUserService cardservice;
	
	
	@CrossOrigin
	@PostMapping("/save-cardinfo")
	@Transactional
	public String registerBilUser(@RequestBody CardUser carduser) {
		cardservice.saveBilUser(carduser);
		return "Hello,"+carduser.getCardnumber()+"your payment is done";	
	}

}
