package com.brubatera.concessionaria.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.brubatera.concessionaria.model.Customer;
import com.brubatera.concessionaria.services.CustomerService;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping
	public ModelAndView showForm() {
		return new ModelAndView( "customerRegistration", "customer", new Customer() );
	}

	@PostMapping("/register")
	@ResponseStatus(HttpStatus.CREATED)
	public String addCustomer(@ModelAttribute("customer") Customer customer) {

		if (customer != null)
			customerService.saveToDatabase( customer );
		else
			return "customerRegisterException";

		return "registerOk";
	}
}
