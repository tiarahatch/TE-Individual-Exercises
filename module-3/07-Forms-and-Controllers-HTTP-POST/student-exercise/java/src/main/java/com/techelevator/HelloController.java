package com.techelevator;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.techelevator.model.JdbcReviewDao;
import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller
public class HelloController {

	@Autowired
	private ReviewDao reviewDao;
	
//	@RequestMapping("/greeting")
//	public String displayGreeting(HttpSession session) {
//
//		return "greeting";
//	}
//	
	@RequestMapping("/")
	public String displayHome(HttpServletRequest request) {
		request.setAttribute("reviews", reviewDao.getAllReviews());
		return "greeting";
	}
	
	@RequestMapping (path="/allReviews", method=RequestMethod.GET)
	public String displayAllReviews(Review newReview, HttpServletRequest request) {
		request.setAttribute("methodUsed", "POST-REDIRECT-GET");
		List<Review>reviews = reviewDao.getAllReviews();
		reviews.add(newReview);
		request.setAttribute("reviews", reviews);
		return "allReviews";
	}
	
	@RequestMapping (path="/reviewInput", method=RequestMethod.GET)
	public String reviewInputForm () {
		return "reviewInput";//"redirect:/allReviews";
	}
	
	@RequestMapping (path="/reviewInput", method=RequestMethod.POST)
	public String reviewInputForm2 (Review inputReview) {
		inputReview.setDateSubmitted(LocalDateTime.now());
		reviewDao.save(inputReview);
		return "redirect:/allReviews";
	}
	
//	@RequestMapping (path="/allReviews", method=RequestMethod.POST)
//	public String displayAllReviews2(Review newReview, HttpServletRequest request) {
//		request.setAttribute("methodUsed", "POST-REDIRECT-GET");
//		List<Review>reviews = reviewDao.getAllReviews();
//		request.setAttribute("reviews", reviews);
//		return "redirect:/allReviews";
//	}
//	@RequestMapping(path="/addCityWithPostAndRedirect", method=RequestMethod.POST)
//	public String addNewCityByPostAndRedirect(City newCity, HttpServletRequest request) {
//		request.setAttribute("methodUsed", "POST-REDIRECT-GET");
//		
//		newCity.setCountryCode("USA");	
//		cityDao.save(newCity);
//		
//		request.setAttribute("cities", cityDao.findCityByCountryCode("USA"));		
//		
//		/*
//		 * Instead of returning a view name, we can return redirect:<controller request mapping> to redirect to
//		 * a GET and keep the form from submitting again on a refresh
//		 */
//		System.out.println("POST-REDIRECT-GET");
//		return "redirect:/";
}
