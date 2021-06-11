package com.example.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.User;
import com.example.project.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userrepo;
	
	public UserService() {}
	
	public UserService(UserRepository userrepo) {
		super();
		this.userrepo = userrepo;
	}
	
	public void saveMyUser(User user) {
		userrepo.save(user);
	}

}
