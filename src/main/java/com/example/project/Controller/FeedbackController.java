package com.example.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Model.Feedback;
import com.example.project.Service.FeedbackService;


@RestController
public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackservice;
	
	@CrossOrigin
	@PostMapping("/save-feedback")
	@Transactional
	public String feedbackData(@RequestBody Feedback feedbacks) {
		feedbackservice.saveFeedback(feedbacks);
		return "Feedback submitted";	
	}
	
	@CrossOrigin
	@GetMapping("/all-feedbacks")
	@Transactional
	public Iterable<Feedback> getFeedbacks() {
		return feedbackservice.getAllFeedbacks();
	}

}
