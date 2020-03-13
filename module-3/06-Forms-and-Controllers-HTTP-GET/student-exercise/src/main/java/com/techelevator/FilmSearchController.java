package com.techelevator;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.FilmDao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FilmSearchController {
	@Autowired
	private FilmDao filmDao;
    
	@RequestMapping("/filmList")
	public String showFilmSearchForm() {
	return "filmList";
	}

	@RequestMapping("/filmListResults")
	public String searchFilms(HttpServletRequest request) {
	request.setAttribute("films", filmDao.getFilmsBetween(request.getParameter("genre"), Integer.parseInt(request.getParameter("minLen")), Integer.parseInt(request.getParameter("maxLen"))));

	 return "filmList";
	}

	}

