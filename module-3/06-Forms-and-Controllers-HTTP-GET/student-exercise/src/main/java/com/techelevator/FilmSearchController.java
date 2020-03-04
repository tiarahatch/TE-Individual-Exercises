package com.techelevator;

import com.techelevator.dao.FilmDao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;
    
    @RequestMapping("/filmSearchForm")
    public String showFilmSearchForm() {
        return "filmSearchForm";
    }

    @RequestMapping("/filmSearch")
    public String searchFilms(HttpServletRequest request) {
    	
    	String actorsFirstName = request.getParameter("firstName");
		String actorsLastName = request.getParameter("lastName");/* Call the model and pass values to the jsp */
		
		System.out.println("FirstName="+ actorsFirstName);
		System.out.println("LastName="+ actorsLastName);
		


        return "filmSearch";
    }

}