package com.example.project.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.Feedback;

import com.example.project.Repository.FeedbackRepository;

@Service
public class FeedbackService {
	
	@Autowired
	private FeedbackRepository feedbackrepo;
	
	public FeedbackService() {}
	  
	 public FeedbackService(FeedbackRepository feedbackrepo) 
	 { super(); 
	 this.feedbackrepo = feedbackrepo; 
	 }
	 
	
	public void saveFeedback(Feedback feedbacks) {
	 feedbackrepo.save(feedbacks);
	}
	
	public List<Feedback> getAllFeedbacks(){
		List<Feedback> feedbacks = new ArrayList<Feedback>();
		for(Feedback feedback : feedbackrepo.findAll()) {
			feedbacks.add(feedback);
		}
		
		return feedbacks;
	}
	

}
