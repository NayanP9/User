package com.example.project.Controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.Editor;
import com.example.project.Service.EditorService;

@RestController
public class EditorController {
	@Autowired
	private EditorService eservice;
	
	
	@CrossOrigin
	@PostMapping("/save-data")
	@Transactional
	public String registerEmployee(@RequestBody Editor editor) {
		eservice.CreatePost(editor);
		return "Hello,your post is submitted";	
	}
	
	@CrossOrigin
	@GetMapping("/all-ed")
	@Transactional
	public Iterable<Editor> showAllUsers() {
	return eservice.showAllData();
	}

}
