package com.brubatera.concessionaria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brubatera.concessionaria.model.Customer;
import com.brubatera.concessionaria.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public void saveToDatabase(Customer customer) {
		customerRepository.save( customer );
	}

}
