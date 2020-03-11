package com.techelevator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller
public class ReviewInputController {
	
	@Autowired
	private ReviewDao reviewDao;

	@RequestMapping(path="/reviewInput", method=RequestMethod.GET)
	public String showReviewForm() {	
		return "reviewInput";
	}
	
//	@RequestMapping(path="/reviewSubmitResult", method=RequestMethod.GET)
//	public String showReviewSubmitionResult() {
//		return "reviewSubmitResult";
//	}
	
	@RequestMapping(path="/allReviews", method=RequestMethod.POST)
	public String saveReview(@RequestParam String name,
			 @RequestParam int rating,
			 @RequestParam String reviewName,
			 @RequestParam String reviewBody) throws FileNotFoundException, IOException {

		Review review = new Review();
		review.setUsername(name);
		review.setRating(rating);
		review.setTitle(reviewName);
		review.setText(reviewBody);
		review.setDateSubmitted(LocalDateTime.now());
		reviewDao.save(review);
	return "redirect:/allReviews";
	}
	
}

