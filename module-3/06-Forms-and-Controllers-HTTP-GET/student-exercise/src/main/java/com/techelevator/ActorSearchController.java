package com.techelevator;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.techelevator.dao.ActorDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	@RequestMapping("/searchActorForm") /* What request mapping do we want here */
	public String showSearchActorForm() {
		return "actorList";
	}

	@RequestMapping("/searchActors")/* What about here? */
	public String searchActors(HttpServletRequest request/* What arguments go here to get parameters from the page? */) {
	
		String actorsLastName = request.getParameter("lastName");/* Call the model and pass values to the jsp */
		
		System.out.println("LastName="+ actorsLastName);
		
		request.setAttribute("actors" , actorDao.getMatchingActors(actorsLastName));
		
		return "actorList";
	}
}
