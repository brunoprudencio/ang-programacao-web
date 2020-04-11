package com.brubatera.concessionaria.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.brubatera.concessionaria.model.AutomobileServicing;
import com.brubatera.concessionaria.services.AutomobileService;

@Controller
@RequestMapping(value = "/auto")
public class AutomobileController {

	@Autowired
	private AutomobileService automobileService;

	@GetMapping
	public ModelAndView showForm(Model model) {
		return new ModelAndView( "automobileServicingRegistration", "automobileservicing", new AutomobileServicing() );
	}

	@PostMapping("/register")
	@ResponseStatus(HttpStatus.CREATED)
	public String addAutomobile(@ModelAttribute("automobileservicing") AutomobileServicing automobileServicing,
			Model model) {

		automobileService.saveToDatabase( automobileServicing );
		return "registerOk";
	}

	@ModelAttribute("typeList")
	public List<String> initTypeList(Model model) {
		return new ArrayList<>( Arrays.asList( "Automóvel", "Moto" ) );
	}

	@ModelAttribute("serviceList")
	public List<String> initServicesList(Model model) {
		return new ArrayList<>(
				Arrays.asList(
						"Troca de pneus",
						"Troca de óleo",
						"Troca de pastilhas de freio",
						"Injeção eletrônica",
						"Reparos em motores",
						"Sistema elétrico",
						"Suspensão"
				) );
	}
}
