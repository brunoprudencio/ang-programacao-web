package com.brubatera.concessionaria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brubatera.concessionaria.model.AutomobileServicing;
import com.brubatera.concessionaria.repositories.AutomobileRepository;

@Service
public class AutomobileService {
	@Autowired AutomobileRepository automobileRepository;

	public void saveToDatabase(AutomobileServicing automobileServicing) {
		automobileRepository.save( automobileServicing );
	}
}
