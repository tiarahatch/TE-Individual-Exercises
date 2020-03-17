package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {
	// GET: /
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}
		
	@RequestMapping(path="/login", method=RequestMethod.GET)
		public String showLoginScreen(ModelMap modelHolder) {
			if(! modelHolder.containsAttribute("login")){
				modelHolder.put("login", new Login());
			}
			return "login";
		}
	@RequestMapping(path="/login", method=RequestMethod.POST)
		public String processLoginScreen(@Valid @ModelAttribute Login login, BindingResult result, RedirectAttributes flash) {
			
			flash.addFlashAttribute("login", login);
			
			if(result.hasErrors()) {
				flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX +"login", result);
				return "redirect:/login";
			}
			return "redirect:/confirmation";
		}
	@RequestMapping(path="/confirmation", method=RequestMethod.GET)
		public String showConfirmationPage() {
			return "confirmation";
		}

	@RequestMapping(path="/register", method=RequestMethod.GET)
		public String showRegistrationScreen(ModelMap modelHolder) {
			if(! modelHolder.containsAttribute("registration")){
				modelHolder.put("registration", new Registration());
			}
			return "register";
		}
	@RequestMapping(path="/register", method=RequestMethod.POST)
		public String processRegistrationScreen(@Valid @ModelAttribute Registration registration, BindingResult result, RedirectAttributes flash) {
			
			flash.addFlashAttribute("registration", registration);
			
		    if (!StringUtils.pathEquals(registration.getConfirmEmail(), registration.getEmail())){
		         result.reject("confirmEmail", "email.confirm.mustequal");
		         flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "registration", result);
		         System.out.println("two emails not equal");
		         return "redirect:/register";
		    }
		    
			if(result.hasErrors()) {
				flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX +"registration", result);
				return "redirect:/register";
			}
			return "redirect:/registrationConfirmation";
		}
	@RequestMapping(path="/registrationConfirmation", method=RequestMethod.GET)
		public String showRegistrationConfirmationPage() {
			return "registrationConfirmation";
		}
		
	}
	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view

	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)

	// GET: /login
	// Return the empty login view

	// POST: /login
	// Validate the model and redirect to login (if successful) or return the
	// login view (if validation fails)

	// GET: /confirmation
	// Return the confirmation view

