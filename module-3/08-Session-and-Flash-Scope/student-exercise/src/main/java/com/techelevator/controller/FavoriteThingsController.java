package com.techelevator.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.model.FavoriteThings;

@Controller
@RequestMapping("/FavoriteThings")
@SessionAttributes("theFavorite")

public class FavoriteThingsController {

@RequestMapping(path = "/Page1", method = RequestMethod.GET)
public String getPage1(ModelMap modelMap) {
	return "page1";
}

@RequestMapping(path="/Page1", method=RequestMethod.POST)
public String inputFavoriteColor(@RequestParam String favoriteColor, ModelMap modelMap, HttpSession session ) {

    FavoriteThings favorite = new FavoriteThings();
    favorite.setFavoriteColor(favoriteColor);
    
    modelMap.addAttribute("theFavorite", favorite);
    return "redirect:/FavoriteThings/Page2";
}

@RequestMapping(path="/Page2", method=RequestMethod.GET)
public String displayPage2() {
	return "page2";
}

@RequestMapping(path= "/Page2", method=RequestMethod.POST)
public String inputFavoriteFood(@RequestParam String favoriteFood, ModelMap modelMap, HttpSession Session) {

    FavoriteThings favorite = (FavoriteThings)modelMap.get("theFavorite");
    favorite.setFavoriteFood(favoriteFood);
    
    modelMap.addAttribute("theFavorite", favorite);
    
    return "redirect:/FavoriteThings/Page3";
}


@RequestMapping(path="/Page3", method=RequestMethod.GET)
public String displayPage3() {
	return "page3";
}

@RequestMapping(path="/Page3", method=RequestMethod.POST)
public String inputFavoriteSeason(@RequestParam String favoriteSeason, ModelMap model) {

    FavoriteThings favorite = (FavoriteThings)model.get("theFavorite");
    favorite.setFavoriteSeason(favoriteSeason);
    
    model.addAttribute("theFavorite", favorite);
    return "redirect:/FavoriteThings/summary";
}

@RequestMapping(path="/summary", method=RequestMethod.GET)
public String displaysummaryPage(HttpSession Session, ModelMap modelMap) {
	return "summary";
}
}


