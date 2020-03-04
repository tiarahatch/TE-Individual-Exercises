package com.techelevator;

import com.techelevator.dao.CustomerDao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;
    
    @RequestMapping("/customerSearchForm")
    public String showCustomerSearchForm() {
    	return "customerList";
    }
    
    @RequestMapping("/searchCustomers")
    public String searchCustomers (HttpServletRequest request) {
    	
    	String customersFirstName = request.getParameter("firstName");
		String customersLastName = request.getParameter("lastName");/* Call the model and pass values to the jsp */
		
		System.out.println("FirstName="+ customersFirstName);
		System.out.println("LastName="+ customersLastName);
		
		request.setAttribute("customers", customerDao.searchAndSortCustomers(customersFirstName, customersLastName));
		
		return "customerList";
	}
    }