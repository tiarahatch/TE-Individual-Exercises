package com.techelevator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.ReviewDao;

@Controller 
public class GreetingController {

	@Autowired
	private ReviewDao reviewDao;
	
	@RequestMapping(path={"/","/allReviews"},method=RequestMethod.GET)
	public String displayExistingReviews(HttpServletRequest request) {
		request.setAttribute("reviews", reviewDao.getAllReviews());

		return "allReviews";
	}
}